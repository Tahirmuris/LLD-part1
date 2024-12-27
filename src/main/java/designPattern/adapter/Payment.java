package designPattern.adapter;

public interface Payment {

    public Double checkBalance(String accountOne, String pin);

    public void transferMoney(String pin, double amount, String currency, String accountOne, String accountTwo);
}
