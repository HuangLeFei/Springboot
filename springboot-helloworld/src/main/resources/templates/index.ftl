<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8" />
<title>index</title>
</head>
<body>
	  你的名字是：${Name}
		<#if sex == 0>
		男
		<#elseif sex == 1>
		女
		<#else>
		其他
		</#if>

		<#list userlist as user>
		${user}
		</#list>
</body> 
</html>