<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>freemarker测试</title>
</head>
<body>
<h1>${message},${name}</h1>


<ol>
        <#list myList as item>
            <li><a href="javascript:void(0)"> ${item!}</a></li>
        </#list>
</ol>

</body>
</html>