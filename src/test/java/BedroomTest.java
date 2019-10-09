import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 1, "Sea View");
        guest1 = new Guest("Joe");
        guest1 = new Guest("Alex");
    }

    @Test
    public void testRoomHasNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }

    @Test
    public void testAddGuestToRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.getNumberOfGuests());
        assertEquals(false, bedroom1.getStatus());
    }
}
