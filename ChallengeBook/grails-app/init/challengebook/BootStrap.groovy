package challengebook

class BootStrap {

    def init = { servletContext ->
        if (ChallengeTime.count() == 0) {

            new ChallengeTime(timer: '5').save()
            new ChallengeTime(timer: '10').save()
            new ChallengeTime(timer: '15').save()
            new ChallengeTime(timer: '20').save()
        }
    }
        def destroy = {
        }
    }

