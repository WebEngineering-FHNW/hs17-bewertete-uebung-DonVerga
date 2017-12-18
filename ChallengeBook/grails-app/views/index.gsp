<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Challenge Book</title>

    <asset:link rel="icon" href="challange.svg" type="image/x-ico" />
</head>

<body>
    <content tag="nav">
        <li class="nav-item controller">
            <a class="nav-link" href="challenge/create">Submit new Challenge</a>
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="challange.svg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to your Daily Challenge</h1>

            <div class="card text-white bg-primary mb-3 row colset-2-its Button" style="max-width: 20rem;">
                <div class="nav" role="navigation">

                </div>
            </div>
            <p>
                klick the on the Icon Card to recive a new Challenge
            </p>
<div>
    <ul>
        <g:each var="challenge" in="${test}">
            <li>${challenge}</li>
        </g:each>
    </ul>

</div>


<div>
    <p><output>${challenge}</output></p>
</div>
        <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                <li class="controller">
                <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                </li>
            </g:each>
            </ul>
        </div>

        </section>
    </div>

</body>
</html>
