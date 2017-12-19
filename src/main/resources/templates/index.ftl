<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   ${song}
   <#if sex==1>
      男
   <#elseif sex==2>
     女
   <#else>
   其他
   </#if>

<#list userList as user >
    ${user}
</#list>







</body>
</html>