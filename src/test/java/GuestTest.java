import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Amanda", 1000);
    }

    @Test
    public void testGuestHasName(){
        assertEquals("Amanda", guest1.getName());
    }


}
