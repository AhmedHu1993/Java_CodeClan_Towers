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

    private Booking booking1;
    private Booking booking2;
    private Booking booking3;
    private Booking booking4;


    @Before
    public void before(){
        codeClanTowers = new Hotel();

        bedroom1 = new Bedroom(101, 2, "Sea View", 50);
        bedroom2 = new Bedroom(102, 3, "Sea View", 60);
        bedroom3 = new Bedroom(103, 4, "Family Room", 90);
        bedroom4 = new Bedroom(201, 1, "Pool View", 40);
        bedroom5 = new Bedroom(202, 2, "Twin Royal Room", 120);

        codeClanTowers.addBedroom(bedroom1);
        codeClanTowers.addBedroom(bedroom2);
        codeClanTowers.addBedroom(bedroom3);
        codeClanTowers.addBedroom(bedroom4);
        codeClanTowers.addBedroom(bedroom5);

        conferenceRoom1 = new ConferenceRoom("Colin",12);
        conferenceRoom2 = new ConferenceRoom("Ski", 6);

        codeClanTowers.addConferenceRoom(conferenceRoom1);
        codeClanTowers.addConferenceRoom(conferenceRoom2);

        guest1 = new Guest("Amanda",900);
        guest2 = new Guest("Shona",800);
        guest3 = new Guest("Joe",750);
        guest4 = new Guest("Alex",600);
        guest5 = new Guest("Ahmed",800);

        booking1 = new Booking(bedroom1, 3, guest1);
        booking2 = new Booking(bedroom2, 5, guest2);
        booking3 = new Booking(bedroom3, 4, guest3);
        booking4 = new Booking(bedroom1, 4, guest5);


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
        codeClanTowers.checkInGuestToBedroom(booking1);
        assertEquals(1, bedroom1.getNumberOfGuests());
        assertEquals(false, bedroom1.getStatus());
    }

    @Test
    public void testCheckGuestOutFromConferenceRoom(){
        codeClanTowers.checkInGuestToConferenceRoom(conferenceRoom1, guest4);
        codeClanTowers.checkGuestOutFromConferenceRoom(conferenceRoom1, guest4);
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
        assertEquals(true, conferenceRoom1.getStatus());
    }

    @Test
    public void testCheckGuestOutFromBedroom(){
        codeClanTowers.checkInGuestToBedroom(booking1);
        codeClanTowers.checkGuestOutFromBedroom(booking1);
        assertEquals(0, bedroom1.getNumberOfGuests());
        assertEquals(true, bedroom1.getStatus());
    }

    @Test
    public void testHowManyVacantRooms(){
        codeClanTowers.checkInGuestToBedroom(booking1);
        codeClanTowers.checkInGuestToBedroom(booking2);
        codeClanTowers.checkInGuestToBedroom(booking3);
        assertEquals(2, codeClanTowers.getVacantRooms());

    }

    @Test
    public void testCanNotAddGuestToOccupiedRoom(){
        codeClanTowers.checkInGuestToBedroom(booking1);
        codeClanTowers.checkInGuestToBedroom(booking4);
        assertEquals(1, bedroom1.getNumberOfGuests());

    }

    @Test
    public void testGuestMultipleCheckInWithInsufficientFunds(){
        codeClanTowers.checkInGuestToBedroom(booking3);
        codeClanTowers.checkInGuestToBedroom(booking3);
        assertEquals("Insufficient Funds",codeClanTowers.checkInGuestToBedroom(booking3));
    }
}
