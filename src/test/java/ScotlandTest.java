import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScotlandTest {

    private Scotland scotland;

    @Before
    public void before(){
        scotland = new Scotland("Gregor Townsend", "Murrayfield", 67144, 15, 40,14,2, 0);
    }

    @Test
    public void canGetCoachName(){
        assertEquals("Gregor Townsend", scotland.getCoach());
    }
    @Test
    public void getStadiumName(){
        assertEquals("Murrayfield", scotland.getStadium());
    }

    @Test
    public void getStadiumCapacity(){
        assertEquals(67144, scotland.getStadiumCapacity());
    }
    @Test
    public void getTotalChampionships(){
        assertEquals(15, scotland.getChampionships());
    }
    @Test
    public void getCalcuttaCups(){
        assertEquals(40, scotland.getCalcuttaCups());
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
        assertEquals(0, scotland.getDoddieWeirCups());
    }

}
