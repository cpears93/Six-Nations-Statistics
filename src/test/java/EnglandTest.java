import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglandTest {

    private England england;

    @Before
    public void before(){
        england = new England("Eddie Jones", "Twickenham Stadium", 82000, 122, 38, 13, 25, 25, 71, 20);
    }

    @Test
    public void getCoachName(){
        assertEquals("Eddie Jones", england.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Twickenham Stadium", england.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(82000, england.getCapacity());
    }

    @Test
    public void getChampionshipEntries(){
        assertEquals(122, england.getChampionshipEntries());
    }

    @Test
    public void getChampionships(){
        assertEquals(38, england.getChampionships());
    }

    @Test
    public void getGrandSlams(){
        assertEquals(13, england.getGrandSlams());
    }

    @Test
    public void getTripleCrowns(){
        assertEquals(25, england.getTripleCrowns());
    }

    @Test
    public void getWoodenSpoons(){
        assertEquals(25, england.getWoodenSpoons());
    }

    @Test
    public void getCalcuttaCups(){
        assertEquals(71, england.getCalcuttaCups());
    }

    @Test
    public void getMillenniumTrophies(){
        assertEquals(20, england.getMillenniumTrophies());
    }
}
