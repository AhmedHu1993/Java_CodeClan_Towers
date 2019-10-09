public class Guest {

    private String name;
    private int wallet;

    public Guest(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

    public void updateWallet(int totalBill) {
        this.wallet -= totalBill;
    }
}
