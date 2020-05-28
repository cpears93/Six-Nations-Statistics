import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IrelandTest {

    private Ireland ireland;

    @Before
    public void before(){
        ireland = new Ireland("Andy Farrell", "Aviva Stadium", 51700, 23,13, 17);
    }

    @Test
    public void getCoachName(){
        assertEquals("Andy Farrell", ireland.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Aviva Stadium", ireland.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(51700, ireland.getCapacity());
    }

    @Test
    public void getChampionships(){
        assertEquals(23, ireland.getChampionships());
    }

    @Test
    public void getMillenniumTrophies(){
        assertEquals(13, ireland.getMillenniumTrophies());
    }

    @Test
    public void getCentenaryQuiach(){
        assertEquals(17, ireland.getCentenaryQuiach());
    }
}
