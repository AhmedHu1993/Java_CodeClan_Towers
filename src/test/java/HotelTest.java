import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel codeClanTowers;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private Bedroom bedroom5;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;


    @Before
    public void before(){
        codeClanTowers = new Hotel();

        bedroom1 = new Bedroom(101, 2, "Sea View");
        bedroom2 = new Bedroom(102, 3, "Sea View");
        bedroom3 = new Bedroom(103, 4, "Family Room");
        bedroom4 = new Bedroom(201, 1, "Pool View");
        bedroom5 = new Bedroom(202, 2, "Twin Royal Room");

        codeClanTowers.addBedroom(bedroom1);
        codeClanTowers.addBedroom(bedroom2);
        codeClanTowers.addBedroom(bedroom3);
        codeClanTowers.addBedroom(bedroom4);
        codeClanTowers.addBedroom(bedroom5);

        conferenceRoom1 = new ConferenceRoom("Colin",12);
        conferenceRoom2 = new ConferenceRoom("Ski", 6);

        codeClanTowers.addConferenceRoom(conferenceRoom1);
        codeClanTowers.addConferenceRoom(conferenceRoom2);

        guest1 = new Guest("Amanda");
        guest2 = new Guest("Shona");
        guest3 = new Guest("Joe");
        guest4 = new Guest("Alex");
        guest5 = new Guest("Ahmed");


    }

    @Test
    public void testNumberOfBedrooms(){
        assertEquals(5, codeClanTowers.getNumberOfBedrooms());
    }

    @Test
    public void testCheckInGuestToAConferenceRoom(){
        codeClanTowers.checkInGuestToConferenceRoom(conferenceRoom1, guest3);
        assertEquals(1, conferenceRoom1.getNumberOfGuests());
        assertEquals(false, conferenceRoom1.getStatus());
    }

    @Test
    public void testCheckInGuestToBedroom(){
        codeClanTowers.checkInGuestToBedroom(bedroom1, guest1);
        codeClanTowers.checkInGuestToBedroom(bedroom1, guest2);
        assertEquals(2, bedroom1.getNumberOfGuests());
        assertEquals(false, bedroom1.getStatus());
    }


}
