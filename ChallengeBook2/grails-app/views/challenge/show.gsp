<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message( default: 'Challenge')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
<body>
<h1>Show contact</h1>
<g:form action="save">
    Title: <g:textField name="title" /><br />
    Description: <g:textField name="description" /><br />
    Challenge Time: <g:textField name="challengeTime"/>
    <g:actionSubmit value="Save" />
</g:form>
</body>
</html>
