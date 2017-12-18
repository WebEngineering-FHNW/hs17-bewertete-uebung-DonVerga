package challengebook

class BootStrap {

    def init = { servletContext ->

        if (ChallengeTime.count() == 0) {

            new ChallengeTime(timer: '5').save()
            new ChallengeTime(timer: '10').save()
            new ChallengeTime(timer: '15').save()
            new ChallengeTime(timer: '20').save()
        }
        new Challenge(title: 'Play Snake', description:'go to https://playsnake.org/ and play 2 rounds try to beat your 1. try score', challengeTime: 1).save()

    }
        def destroy = {
        }
    }

