<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8" />
<title>index</title>
</head>
<body>
	  ��������ǣ�${Name}
		<#if sex == 0>
		��
		<#elseif sex == 1>
		Ů
		<#else>
		����
		</#if>

		<#list userlist as user>
		${user}
		</#list>
</body> 
</html>