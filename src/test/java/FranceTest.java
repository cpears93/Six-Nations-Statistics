import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FranceTest {

    private France france;

    @Before
    public void before(){
        france = new France("Fabian Galthié", "Stade De France", 81338, 88,25, 9, 18, 1, 12);
    }

    @Test
    public void getCoachName(){
        assertEquals("Fabian Galthié", france.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Stade De France", france.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(81338, france.getCapacity());
    }

    @Test
    public void getChampionshipsEntered(){
        assertEquals(88, france.getChampionshipsEntered());
    }

    @Test
    public void getChampionships(){
        assertEquals(25, france.getChampionships());
    }

    @Test
    public void getGrandSlams(){
        assertEquals(9, france.getGrandSlams());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(18, france.getWoodenSpoons());
    }

    @Test
    public void getAuldAllianceTrophies(){
        assertEquals(1, france.getAuldAllianceTrophy());
    }

    @Test
    public void getGiuseppeGaribaldiTrophy(){
        assertEquals(12, france.getGiuseppeGaribaldiTrophy());
    }
}
