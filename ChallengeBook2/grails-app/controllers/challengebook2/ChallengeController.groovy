package challengebook2

class ChallengeController {

        static scaffold = Challenge

    def index = {
        def randomChallenges
        randomChallenges = Challenge.list()
        Collections.shuffle(randomChallenges)
        def randomChellange = randomChallenges[0]
        [randomChellange: randomChellange]
    }
        def create = {}

        def edit = {
            def challenge = Challenge.get(params)
            [challenge: challenge]
        }
        def update = {
            def challenge = Challenge.get(params)
            challenge.properties = params
            challenge.save flush: true, failOnError: true
            redirect action: "show", id: params.id
        }
        def show = {
            render(view:'/index')
        }
        def list = {
            def challenge = Challenge.list()
            [challenge: challenge]
        }
        def delete = {
            def challenge = Challenge.get(params)
            challenge.delete flush: true, failOnError: true
            redirect action: "index"
        }
    }
