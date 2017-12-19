<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'challenge.label', default: 'Challenge')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
<body>

   <g:each in="time" >
       <h3>${time.timer}</h3>
   </g:each>

</body>
</html>