import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalesTest {

    private Wales wales;

    @Before
    public void before(){
        wales = new Wales("Wayne Pivac", "Principality Stadium", "Parc y Scarlets", 74500, 14870, 124, 39, 12, 22, 21, 3);
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

    public void getOct2020Stadium(){
        assertEquals("Parc y Scarlets",wales.getOct2020Stadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(74500,wales.getCapacity());
    }

    @Test

    public void getOct2020Capacity(){
        assertEquals(14870,wales.getOct2020Capacity());
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
        assertEquals(22,wales.getTripleCrowns());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(21,wales.getWoodenSpoons());
    }

    @Test
    public void getDoddieWeirCups(){
        assertEquals(3,wales.getDoddieWeirCups());
    }

}
