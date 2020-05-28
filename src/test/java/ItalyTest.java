import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalyTest {

    private Italy italy;

    @Before
    public void before(){
        italy = new Italy("Franco Smith", "Stadio Olympico", 72698, 19,0, 0, 14, 2);
    }

    @Test
    public void getCoachName(){
        assertEquals("Franco Smith", italy.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Stadio Olympico", italy.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(72698, italy.getCapacity());
    }

    @Test
    public void getChampionshipsEntered(){
        assertEquals(19, italy.getChampionshipsEntered());
    }

    @Test
    public void getChampionships(){
        assertEquals(0, italy.getChampionships());
    }

    @Test
    public void getGrandSlams(){
        assertEquals(0, italy.getGrandSlams());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(14, italy.getWoodenSpoons());
    }

    @Test
    public void getGiuseppeGaribaldiTrophies(){
        assertEquals(2, italy.getGiuseppeGaribaldiTrophies());
    }
}
