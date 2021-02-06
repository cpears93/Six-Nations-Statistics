import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScotlandTest {

    private Scotland scotland;

    @Before
    public void before(){
        scotland = new Scotland("Gregor Townsend", "Murrayfield Stadium", 67144, 124, 24, 3, 10, 33, 41, 14, 2, 1);
    }

    @Test
    public void getCoachName(){
        assertEquals("Gregor Townsend", scotland.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Murrayfield Stadium", scotland.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(67144, scotland.getCapacity());
    }

    @Test
    public void getChampionshipsEntered(){
        assertEquals(124, scotland.getChampionshipsEntered());
    }

    @Test
    public void getChampionships(){
        assertEquals(24, scotland.getChampionships());
    }

    @Test
    public void getGrandSlams(){
        assertEquals(3, scotland.getGrandSlams());
    }

    @Test
    public void getTripleCrowns(){
        assertEquals(10, scotland.getTripleCrowns());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(33, scotland.getWoodenSpoons());
    }

    @Test
    public void getCalcuttaCups(){
        assertEquals(41, scotland.getCalcuttaCups());
    }

    @Test
    public void getCentenaryQuiach(){
        assertEquals(14, scotland.getCentenaryQuaich());
    }

    @Test
    public void getAuldAllianceTrophies(){
        assertEquals(2, scotland.getAuldAllianceTrophies());
    }

    @Test
    public void getDoddieWeirCups(){
        assertEquals(1, scotland.getDoddieWeirCups());
    }

}
