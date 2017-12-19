<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Challenge Book</title>

    <asset:link rel="icon" href="challange.svg" type="image/x-ico" />
</head>

<body >
<content tag="nav">
    <li class="nav-item">
        <a class="nav-link" href="challenge/create">Submit new Challenge</a>
</content>

<div class="flagbackground">
<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <g:link controller="challenge">

            <asset:image src="challange.svg" class="challenge-logo"/>
    </g:link>
    </div>

</div>


<div id="content" role="main">

    <section class="row colset-2-its">
        <h1>Welcome to your Daily Challenge</h1>

        <p>klick the on the Icon Card to recive a new Challenge</p>
        <div>
            <p><output>${challenge}</output></p>

        </div>
    </section>
</div>
</div>
</body>


</html>
