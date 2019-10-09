public class Booking {

    private Guest guest;
    private Bedroom bedroom;
    private int numberOfNights;
    private Boolean sufficientFunds;

    public Booking(Bedroom bedroom, int numberOfNights, Guest guest){
        this.bedroom = bedroom;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
        this.sufficientFunds = true;
    }

    public Boolean returnBedroomStatus() {
        return this.bedroom.getStatus();
    }

    public int totalBill() {
        return this.bedroom.getNightRate() * this.numberOfNights;
    }

    public int remainingWalletOfGuest(){

        return this.guest.getWallet() - totalBill();
    }

    public Guest getGuest() {
        return this.guest;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }
}
