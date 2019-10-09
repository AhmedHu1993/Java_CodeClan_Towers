import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> conferenceGuests;
    private String name;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.conferenceGuests = new ArrayList<Guest>();
    }

    public String getName(){
        return this.name;
    }

}
