public class Ireland {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int tripleCrowns;
    private int woodenSpoons;
    private int millenniumTrophies;
    private int centenaryQuiach;

    public Ireland(String coach, String stadium, int capacity, int championshipsEntered, int championships, int grandSlams, int tripleCrowns, int woodenSpoons, int millenniumTrophies, int centenaryQuiach){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championshipsEntered = championshipsEntered;
        this.championships = championships;
        this.grandSlams = grandSlams;
        this.tripleCrowns = tripleCrowns;
        this.woodenSpoons = woodenSpoons;
        this.millenniumTrophies = millenniumTrophies;
        this.centenaryQuiach = centenaryQuiach;
    }

    public String getCoach(){
        return this.coach;
    }

    public String getStadium(){
        return this.stadium;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getChampionshipsEntered(){
        return this.championshipsEntered;
    }

    public int getChampionships(){
        return this.championships;
    }

    public int getGrandSlams(){
        return this.grandSlams;
    }

    public int getTripleCrowns(){
        return this.tripleCrowns;
    }

    public int getWoodenSpoons(){
        return this.woodenSpoons;
    }

    public int getMillenniumTrophies(){
        return this.millenniumTrophies;
    }

    public int getCentenaryQuiach(){
        return this.centenaryQuiach;
    }

}
