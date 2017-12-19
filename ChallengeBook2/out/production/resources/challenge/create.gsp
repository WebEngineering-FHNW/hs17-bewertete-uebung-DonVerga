<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'challenge.label', default: 'Challenge')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
<body>
<h1>Create new contact</h1>
<g:form action="save">
    Name: <g:textField name="title" /><br />
    Phone Number: <g:textField name="description" /><br />
    <g:actionSubmit value="Save" />
</g:form>
</body>
</html>
