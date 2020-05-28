import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalesTest {

    private Wales wales;

    @Before
    public void before(){
        wales = new Wales("Wayne Pivac", "Principality Stadium", 74500,124, 39,12,21, 21, 2);
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
    public void getChampionshipsEntred(){
        assertEquals(124,wales.getChampionshipsEntered());
    }

    @Test
    public void getChampionships(){
        assertEquals(39,wales.getChampionships());
    }

    @Test
    public void getGrandSlams(){
        assertEquals(12,wales.getGrandSlams());
    }

    @Test
    public void getTripleCrowns(){
        assertEquals(21,wales.getTripleCrowns());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(21,wales.getWoodenSpoons());
    }

    @Test
    public void getDoddieWeirCups(){
        assertEquals(2,wales.getDoddieWeirCups());
    }

}
