package challengebook2

class Challenge {

    String title
    String description
    ChallengeTime challengeTime


    static constraints = {
        title(blank:false, nullable: false, size:3..80)
        description(blank:false, nullable: false, size:3..80)
        challengeTime(blank: false, nullable:false)
    }
}
