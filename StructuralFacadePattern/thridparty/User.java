package StructuralFacadePattern.thridparty;

public class User {
    private String id;
    private String name;
    private  double balance;
    private String currency;
    private String accountNbr;

    public User(String id, String name, double balance, String currency, String accountNbr) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.accountNbr = accountNbr;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
