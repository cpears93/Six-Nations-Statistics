public class Wales {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int tripleCrowns;
    private int woodenSpoons;
    private int doddieWeirCups;

    public Wales(String coach, String stadium, int capacity, int championshipsEntered, int championships, int grandSlams, int tripleCrowns, int woodenSpoons, int doddieWeirCups){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championshipsEntered = championshipsEntered;
        this.championships = championships;
        this.grandSlams = grandSlams;
        this.tripleCrowns = tripleCrowns;
        this.woodenSpoons = woodenSpoons;
        this.doddieWeirCups = doddieWeirCups;
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

    public int getDoddieWeirCups(){
        return this.doddieWeirCups;
    }
}
