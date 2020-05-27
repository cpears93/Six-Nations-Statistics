public class Ireland {

    private String coach;
    private String stadium;
    private int capacity;
    private int championships;
    private int millenniumTrophies;
    private int centenaryQuiach;

    public Ireland(String coach, String stadium, int capacity, int championships, int millenniumTrophies, int centenaryQuiach){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championships = championships;
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

    public int getChampionships(){
        return this.championships;
    }

    public int getMillenniumTrophies(){
        return this.millenniumTrophies;
    }

    public int getCentenaryQuiach(){
        return this.centenaryQuiach;
    }

}
