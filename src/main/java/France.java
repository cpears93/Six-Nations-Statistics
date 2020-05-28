public class France {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int woodenSpoons;
    private int auldAllianceTrophy;
    private int giuseppeGaribaldiTrophy;


    public France(String coach, String stadium, int capacity, int championshipsEntered, int championships, int grandSlams, int woodenSpoons, int auldAllianceTrophy, int giuseppeGaribaldiTrophy) {
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championshipsEntered = championshipsEntered;
        this.championships = championships;
        this.grandSlams = grandSlams;
        this.woodenSpoons = woodenSpoons;
        this.auldAllianceTrophy = auldAllianceTrophy;
        this.giuseppeGaribaldiTrophy = giuseppeGaribaldiTrophy;
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

    public int getWoodenSpoons(){
        return this.woodenSpoons;
    }

    public int getAuldAllianceTrophy(){
        return this.auldAllianceTrophy;
    }

    public int getGiuseppeGaribaldiTrophy(){
        return this.giuseppeGaribaldiTrophy;
    }
}