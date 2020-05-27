import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalyTest {

    private Italy italy;

    @Before
    public void before(){
        italy = new Italy("Franco Smith", "Stadio Olympico", 72698, 0,2);
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
    public void getChampionships(){
        assertEquals(0, italy.getChampionships());
    }

    @Test
    public void getGiuseppeGaribaldiTrophies(){
        assertEquals(2, italy.getGiuseppeGaribaldiTrophies());
    }
}
