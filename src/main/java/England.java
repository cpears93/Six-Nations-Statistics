import com.sun.org.apache.bcel.internal.generic.RET;

public class England {

    private String coach;
    private String stadium;
    private int capacity;
    private int championships;
    private int calcuttaCups;
    private int millenniumTrophies;

    England(String coach, String stadium, int capacity, int championships, int calcuttaCups, int millenniumTrophies){
        this.coach = coach;
        this.stadium = stadium;
        this.capacity = capacity;
        this.championships = championships;
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

    public int getChampionships(){
        return this.championships;
    }

    public int getCalcuttaCups(){
        return this.calcuttaCups;
    }

    public int getMillenniumTrophies(){
        return this.millenniumTrophies;
    }
}
