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
