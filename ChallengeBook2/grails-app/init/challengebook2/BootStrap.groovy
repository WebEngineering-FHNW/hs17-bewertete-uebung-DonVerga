package challengebook2

class BootStrap {

    def init = { servletContext ->

            new ChallengeTime(timer: 3).save(flush: true)
            new ChallengeTime(timer: 5).save(flush: true)
            new ChallengeTime(timer: 10).save(flush: true)
            new ChallengeTime(timer: 15).save(flush: true)




        new Challenge(title: 'Play Snake', description: 'go to https://playsnake.org/ and play 2 rounds try to beat your 1. try score', challengeTime: 1).save(flush: true)
        new Challenge(title: 'Do Push ups', description: 'try to make 20 push ups', challengeTime: 1).save(flush: true)
        new Challenge(title: 'Power walk', description: 'make a powerwalk around your block', challengeTime: 1).save(flush: true)
        new Challenge(title: 'Power nap', description: 'try a power nap', challengeTime: 2).save(flush: true)
        new Challenge(title: 'Circles', description: 'try to make a perfect circle', challengeTime: 3).save(flush: true)
        new Challenge(title: 'DIY', description: 'Go to youtube.com and find a DIY video and do it', challengeTime: 4).save(flush: true)
        new Challenge(title: 'Self awareness', description: 'Meditade to find your inner peace', challengeTime: 2).save(flush: true)
        new Challenge(title: 'Whisky', description: 'Inform yourself about diffrent whisky qualities', challengeTime: 3).save(flush: true)



        def destroy = {
        }
    }
}

