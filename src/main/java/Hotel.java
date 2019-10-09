import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public String checkInGuestToBedroom(Booking booking){
        Bedroom bedroom = booking.getBedroom();
        Guest guest = booking.getGuest();
        String errorMsg = "";
        if (guest.getWallet() > booking.totalBill()){
            bedroom.addGuest(guest);
            guest.updateWallet(booking.totalBill());
        } else {
           errorMsg = "Insufficient Funds";
        }
        return errorMsg;
    }

    public void checkGuestOutFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }

    public void checkGuestOutFromBedroom(Booking booking) {
        Bedroom bedroom = booking.getBedroom();
        Guest guest = booking.getGuest();
        bedroom.removeGuest(guest);
    }

    public int getVacantRooms() {
        ArrayList<Bedroom> vacantRooms;
        vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getStatus()){
                vacantRooms.add(bedroom);
            }

        }
        return vacantRooms.size();
    }
}
