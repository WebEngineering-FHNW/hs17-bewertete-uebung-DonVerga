package challengebook2

class ChallengeTime {
    Integer timer

    static constraints = {
        timer(blank: false, nullable: false)
    }
    String toString(){return timer.toString()}

}
