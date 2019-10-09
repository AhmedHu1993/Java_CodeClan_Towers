import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "Sea View");
    }

    @Test
    public void testRoomHasNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }

}
