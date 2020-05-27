public class France {

    private String coach;
    private String stadium;
    private int capacity;
    private int championships;
    private int auldAllianceTrophy;
    private int giuseppeGaribaldiTrophy;


    public France(String coach, String stadium, int capacity, int championships, int auldAllianceTrophy, int giuseppeGaribaldiTrophy) {
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championships = championships;
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

    public int getChampionships(){
        return this.championships;
    }

    public int getAuldAllianceTrophy(){
        return this.auldAllianceTrophy;
    }

    public int getGiuseppeGaribaldiTrophy(){
        return this.giuseppeGaribaldiTrophy;
    }
}