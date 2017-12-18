package challengebook

class Challenge {


    String title;
    String description;


    ChallengeTime challangeTime;


    static constrains = {
        title(blank:false, nullable: false, size:3..80)
        challangeTime(blank: false, nullable:false)
        description(blank:false, nullable: false, size:3..80)


    }

}
