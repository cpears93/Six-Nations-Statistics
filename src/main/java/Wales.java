public class Wales {

    private String coach;
    private String stadium;
    private String oct2020Stadium;
    private int capacity;
    private int oct2020Capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int tripleCrowns;
    private int woodenSpoons;
    private int doddieWeirCups;

    public Wales(String coach, String stadium, String oct2020Stadium, int capacity, int oct2020Capacity, int championshipsEntered, int championships, int grandSlams, int tripleCrowns, int woodenSpoons, int doddieWeirCups){
        this.coach = coach;
        this.stadium = stadium;
        this.oct2020Stadium = oct2020Stadium;
        this.capacity = capacity;
        this.oct2020Capacity = oct2020Capacity;
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

    public String getOct2020Stadium(){
        return this.oct2020Stadium;
    }

    public int getCapacity(){
        return this.capacity;
    }
    
    public int getOct2020Capacity(){
        return this.oct2020Capacity;
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
