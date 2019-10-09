import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 1, "Sea View", 80);
        guest1 = new Guest("Joe",400);
        guest1 = new Guest("Alex",500);
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

    @Test
    public void testRemoveGuestFromRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }
}
