public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Boolean returnBedroomStatus() {
        return this.bedroom.getStatus();
    }

    public int totalBill() {
        return this.bedroom.getNightRate() * this.numberOfNights;
    }
}
