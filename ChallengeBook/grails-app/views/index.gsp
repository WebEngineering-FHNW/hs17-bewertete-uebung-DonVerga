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
            <a class="nav-link" href="challenge">Submit new Challenge</a>



    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="challange.svg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to your Daily Challenge</h1>

            <div class="card text-white bg-primary mb-3 row colset-2-its" style="max-width: 20rem;">
                <div class="card-body" onclick="">
                    <h4 class="card-title">Get Challegne</h4>
                </div>
            </div>
            <p>
                klick the on the Icon Card to recive a new Challenge
            </p>

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
