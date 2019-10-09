import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> checkedInGuests;
    private String type;


    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.checkedInGuests = new ArrayList<Guest>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

}
