<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'challenge.label', default: 'Challenge')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
<body>
<h1>Show contact</h1>
Name: ${challenge.title}<br />
Phone Number: ${challenge.description}<br />
<g:link action="edit" id="${challenge.id}">Edit</g:link><br />
<g:link action="delete" id="${challenge.id}">Delete</g:link>
</body>
</html>
