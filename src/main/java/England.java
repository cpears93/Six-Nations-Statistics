public class England {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipEntries;
    private int championships;
    private int grandSlams;
    private int tripleCrowns;
    private int woodenSpoons;
    private int calcuttaCups;
    private int millenniumTrophies;

    England(String coach, String stadium, int capacity, int championshipEntries, int championships, int grandSlams, int tripleCrowns, int woodenSpoons, int calcuttaCups, int millenniumTrophies){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championshipEntries = championshipEntries;
        this.championships = championships;
        this.grandSlams = grandSlams;
        this.tripleCrowns = tripleCrowns;
        this.woodenSpoons = woodenSpoons;
        this.calcuttaCups = calcuttaCups;
        this.millenniumTrophies = millenniumTrophies;
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

    public int getChampionshipEntries(){
        return this.championshipEntries;
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

    public int getCalcuttaCups(){
        return this.calcuttaCups;
    }

    public int getMillenniumTrophies(){
        return this.millenniumTrophies;
    }
}
