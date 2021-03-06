public class Scotland {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int tripleCrowns;
    private int woodenSpoons;
    private int calcuttaCups;
    private int centenaryQuaich;
    private int auldAllianceTrophies;
    private int doddieWeirCups;

    public Scotland(String coach, String stadium, int capacity,  int championshipsEntered, int championships, int grandSlams, int triplecrowns, int woodenSpoons, int calcuttaCups, int centenaryQuaich, int auldAllianceTrophies, int doddieWeirCups){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championshipsEntered = championshipsEntered;
        this.championships = championships;
        this.grandSlams = grandSlams;
        this.tripleCrowns = triplecrowns;
        this.woodenSpoons = woodenSpoons;
        this.calcuttaCups = calcuttaCups;
        this.centenaryQuaich = centenaryQuaich;
        this.auldAllianceTrophies = auldAllianceTrophies;
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

    public int getCalcuttaCups(){
        return this.calcuttaCups;
    }

    public int getCentenaryQuaich(){
        return this.centenaryQuaich;
    }

    public int getAuldAllianceTrophies(){
        return this.auldAllianceTrophies;
    }

    public int getDoddieWeirCups(){
        return this.doddieWeirCups;
    }
}
