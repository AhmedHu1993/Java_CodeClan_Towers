import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "Standard Double", 70);
        booking1 = new Booking(bedroom1, 4);
    }

    @Test
    public void testBedroomStatusBeforeBooking() {
        assertEquals(true, booking1.returnBedroomStatus());
    }

    @Test
    public void testTotalBillForBooking() {
        assertEquals(280, booking1.totalBill());
    }
}
