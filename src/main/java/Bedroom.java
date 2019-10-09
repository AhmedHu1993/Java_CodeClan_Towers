import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> checkedInGuests;
    private String type;
    private Boolean vacant;


    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.checkedInGuests = new ArrayList<Guest>();
        this.vacant = true;
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
        if (this.checkedInGuests.size() < this.capacity) {
            this.checkedInGuests.add(guest);
        }
        checkVacant();
    }


}
