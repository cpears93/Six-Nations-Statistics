import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglandTest {

    private England england;

    @Before
    public void before(){
        england = new England("Eddie Jones", "Twickenham", 82000, 28,71, 20);
    }

    @Test
    public void getCoachName(){
        assertEquals("Eddie Jones", england.getCoach());
    }

    @Test
    public void getStadiumName(){
        assertEquals("Twickenham", england.getStadium());
    }

    @Test
    public void getCapacity(){
        assertEquals(82000, england.getCapacity());
    }

    @Test
    public void getChampionships(){
        assertEquals(28, england.getChampionships());
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
