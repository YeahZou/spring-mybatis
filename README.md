# 问题总结
## 单元测试报错：no runnable methods  
1、测试类中没有可运行的方法（尤其是基类中没有方法）  
2、没有加@Test注解  
## 页面的第一次请求报错500，第二次报错400  
没有将maven依赖设置Deployment Assemby  
## 页面报错500，提示No qualifying bean of type [com.yeah.service.UserService] found for dependency  
原因是不能autowired service导致的，可能是如下几种情况：  
1、service类没有加@Service注解  
2、配置文件中没有设置扫描加了@Service注解的类  
3、没有导入配置文件（如在web.xml中导入）  
## Controller 类中的 RequestMapping相对于应用名
比如我的应用名叫 springmybatis，则Controller类上的RequestMapping为“/”，而不是“/springmybatis”。请求http://localhost:8080/springmybatis/user.do对应的RequestMapping为/user.do  
## 给页面返回JSON
方法一：在Controller类中的方法上添加@ResponseBody注解，该方法返回一个对象（Object/Vo）  
方法二：使用response.getWriter().print(vo)方法，如果Vo中定义了toString方法，则会返回该方法的结果，可能跟预期不符，所以需要手动处理。  
方法三：使用response.getWriter().print(vo)方法，并在 springmvc对应的配置文件中配置RequestMappingHandlerAdapter，pom中还需导入jackson包  
``` xml
<bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter" p:ignoreDefaultModelOnRedirect="true" >
  <property name="messageConverters">
    <list>
      <bean class="org.springframework.http.converter.json.MappingJacksonHttpMessageConverter"/>
    </list>
  </property>
</bean>
```
## web.xml问题
不同的web.xml版本，配置可能不同。每个标签的顺序也必须对应，否则报错。有关web.xml文件的详细说明，请查看tomcat/servlet的有关文档。