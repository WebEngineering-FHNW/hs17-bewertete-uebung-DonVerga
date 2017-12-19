<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
<body>
<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <g:link controller="challenge">

            <asset:image src="challange.svg" class="challenge-logo"/>
        </g:link>

            <g:form in="randomChallenge">
                <div class="card text-white bg-dark mb-3" style="max-width: 20rem;">
                    <div class="card-header">Time: ${randomChellange.challengeTime} min</div>

                    <div class="card-body">
                        <h4 class="card-title">${randomChellange.title}</h4>
                        <p class="card-text">${randomChellange.description}</p>
                    </div>
                </div>
            </g:form>

    </div>
</div>

</body>
</html>