public class Scotland {

    private String coach;
    private String stadium;
    private int stadiumCapacity;
    private int championships;
    private int calcuttaCups;
    private int centenaryQuaich;
    private int auldAllianceTrophies;
    private int doddieWeirCups;

    public Scotland(String coach, String stadium, int stadiumCapacity, int championships, int calcuttaCups, int centenaryQuaich, int auldAllianceTrophies, int doddieWeirCups){
        this.coach = coach;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
        this.championships = championships;
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

    public int getStadiumCapacity(){
        return this.stadiumCapacity;
    }

    public int getChampionships(){
        return this.championships;
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