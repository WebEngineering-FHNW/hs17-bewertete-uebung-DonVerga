package challengebook

class BootStrap {

    def init = { servletContext ->

        if (ChallengeTime.count() == 0) {

            new ChallengeTime(timer: '3').save()
            new ChallengeTime(timer: '5').save()
            new ChallengeTime(timer: '10').save()
            new ChallengeTime(timer: '15').save()
        }
        new Challenge(title: 'Play Snake', description:'go to https://playsnake.org/ and play 2 rounds try to beat your 1. try score', challengeTime: 2).save()
        new Challenge(title: 'Do Push ups', description:'try to make 20 push ups', challengeTime: 1).save()
        new Challenge(title: 'Power walk', description:'make a powerwalk around your block', challengeTime: 1).save()
        new Challenge(title: 'Power nap', description:'try a power nap', challengeTime: 2).save()
        new Challenge(title: 'Circles', description:'try to make a perfect circle', challengeTime: 1).save()
        new Challenge(title: 'DIY', description:'Go to youtube.com and find a DIY video and do it', challengeTime: 4).save()
        new Challenge(title: 'Self awareness', description:'Meditade to find your inner peace', challengeTime: 2).save()
        new Challenge(title: 'Whisky', description:'Inform yourself about diffrent whisky qualities', challengeTime: 3).save()

    }
        def destroy = {
        }
    }

