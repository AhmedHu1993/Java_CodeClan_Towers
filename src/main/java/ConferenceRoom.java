import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> conferenceGuests;
    private String name;
    private Boolean vacant;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.conferenceGuests = new ArrayList<Guest>();
        this.vacant = true;
    }

    public String getName(){
        return this.name;
    }

    public void checkVacant(){
        if (this.conferenceGuests.size() > 0){
            this.vacant = false;
        } else if (this.conferenceGuests.size() == 0){
            this.vacant = true;
        }
    }

    public void addGuest(Guest guest){
        if (this.conferenceGuests.size() < this.capacity) {
            this.conferenceGuests.add(guest);
        }
        checkVacant();
    }

    public int getNumberOfGuests() {
        return this.conferenceGuests.size();
    }

    public boolean getStatus() {
        return this.vacant;
    }
}
