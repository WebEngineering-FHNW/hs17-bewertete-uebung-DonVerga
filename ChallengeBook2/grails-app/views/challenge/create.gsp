<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'challenge.label', default: 'Challenge')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
<body>
<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <div id="fromBlock">
</br>
<h4>Create new Challenge</h4>


<g:form action="save">
    <h1>Title: </h1><g:textField id="titlefield" name="title" /><br /><br />
    <p>Description:</p> <g:textArea id="descriptionArea" name="description" /><br /><br />
    <p> Challenge Time: <g:select id="challengeTime" name="challengeTime" from="[1, 2, 3, 4]"/> minutes</p><br /><br />
    <g:actionSubmit id="submitButton"  value="Save" />

</g:form>
</div>
    </div>
    </div>
</div>
</body>
</html>
