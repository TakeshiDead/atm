public class Account {
    private int pin;
    private float balance;
    private String name;
    public Account() {
    }
    public Account(int pin, float balance, String name) {
        this.pin = pin;
        this.balance = balance;
        this.name = name;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
