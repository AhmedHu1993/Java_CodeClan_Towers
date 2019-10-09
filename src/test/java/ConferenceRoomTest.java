import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Colin Suite", 12);
    }

    @Test
    public void testConferenceRoomHasName(){
        assertEquals("Colin Suite", conferenceRoom1.getName());
    }

}
