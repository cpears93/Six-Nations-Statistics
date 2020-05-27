import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalesTest {

    private Wales wales;

    @Before
    public void before(){
        wales = new Wales("Wayne Pivac", "Principality Stadium", 74500, 27, 2);
    }

    @Test
    public void getCoachName(){
        assertEquals("Wayne Pivac",wales.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Principality Stadium",wales.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(74500,wales.getCapacity());
    }

    @Test
    public void getChampionships(){
        assertEquals(27,wales.getChampionships());
    }

    @Test
    public void getDoddieWeirCups(){
        assertEquals(2,wales.getDoddieWeirCups());
    }

}
