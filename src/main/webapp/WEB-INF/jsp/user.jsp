<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Web Page</title>
<script type="text/javascript">
window.onload = function() {
	var Ajax = {
		get: function(url, cb) {
			var xhr = new XMLHttpRequest();
			xhr.open('GET', url, true);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200 || xhr.status == 304) {
					cb.call(this, xhr.responseText);
				}
			};
			
			xhr.send();
		},
		
		post: function(url, data, cb) {
			var xhr = new XMLHttpRequest();
			xhr.open("POST", url, true);
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 304)) {
					cb.call(this, xhr.responseText);
				}
			};
			xhr.send(data);
		}
	};
	var btn = document.getElementById("searchUser");
	btn.onclick = function() {
		var user = document.getElementById("userId");
		var userId = user.value;
		
		if (userId) {
			var url = "http://" + window.location.host + "/springmybatis/user?id=" + userId;
			Ajax.get(url, function(data) {
				console.log(data);
			});
		}
	}
};
</script>
</head>
<body>
<div>
<label>Please enter user id:</label>
<input type="text" id="userId" name="userId" placeholder="Enter user id"/>
<button type="button" id="searchUser">确定</button>
</div>
</body>
</html>