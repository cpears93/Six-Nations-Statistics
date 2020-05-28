public class Italy {

    private String coach;
    private String stadium;
    private int capacity;
    private int championshipsEntered;
    private int championships;
    private int grandSlams;
    private int woodenSpoons;
    private int giuseppeGaribaldiTrophies;

    public Italy(String coach, String stadium, int capacity, int championships, int giuseppeGaribaldiTrophies){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championships = championships;
        this. giuseppeGaribaldiTrophies = giuseppeGaribaldiTrophies;
    }

    public String getCoach() {
        return this.coach;
    }

    public String getStadium() {
        return this.stadium;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getChampionships() {
        return this.championships;
    }

    public int getGiuseppeGaribaldiTrophies() {
        return this.giuseppeGaribaldiTrophies;
    }
}
