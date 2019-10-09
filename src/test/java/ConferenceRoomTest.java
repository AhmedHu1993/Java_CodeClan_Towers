import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Colin Suite", 12);
        guest1 = new Guest("Alex", 600);
    }

    @Test
    public void testConferenceRoomHasName(){
        assertEquals("Colin Suite", conferenceRoom1.getName());
    }

    @Test
    public void testAddGuestToRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getNumberOfGuests());
        assertEquals(false, conferenceRoom1.getStatus());
    }

    @Test
    public void testRemoveGuestFromRoom(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }

}
