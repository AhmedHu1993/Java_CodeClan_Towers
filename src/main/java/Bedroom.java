import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> checkedInGuests;
    private String type;
    private Boolean vacant;
    private int nightRate;


    public Bedroom(int roomNumber, int capacity, String type, int nightRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.checkedInGuests = new ArrayList<Guest>();
        this.vacant = true;
        this.nightRate = nightRate;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void checkVacant(){
        if (this.checkedInGuests.size() > 0){
            this.vacant = false;
        } else if (this.checkedInGuests.size() == 0){
            this.vacant = true;
        }
    }

    public void addGuest(Guest guest){
        if (this.checkedInGuests.size() < this.capacity && this.vacant ) {
            this.checkedInGuests.add(guest);
        }
        checkVacant();
    }

    public int getNumberOfGuests() {
        return this.checkedInGuests.size();
    }

    public boolean getStatus() {
        return this.vacant;
    }

    public void removeGuest(Guest guest) {
        if (this.checkedInGuests.contains(guest)) {
            this.checkedInGuests.remove(guest);
        }
        checkVacant();
    }

    public int getNightRate(){
        return this.nightRate;
    }
}
