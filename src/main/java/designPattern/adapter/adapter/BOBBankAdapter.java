package designPattern.adapter.adapter;

import designPattern.adapter.BOBBank;
import designPattern.adapter.Payment;

public class BOBBankAdapter implements Payment {

    private BOBBank bobBank;

    private String user;


    @Override
    public Double checkBalance(String accountOne, String pin) {
        return bobBank.checkBalance(user, accountOne, pin);
    }

    @Override
    public void transferMoney(String pin, double amount, String currency, String accountOne, String accountTwo) {
        if (checkBalance(accountOne, pin) >= amount) {
            bobBank.TransferTo(user, currency, accountOne, accountTwo);
        }
    }
}
