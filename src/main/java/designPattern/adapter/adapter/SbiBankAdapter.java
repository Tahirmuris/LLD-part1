package designPattern.adapter.adapter;

import designPattern.adapter.Payment;
import designPattern.adapter.SbiBank;

public class SbiBankAdapter implements Payment {


    private SbiBank sbiBank;

    private String userInformation;

    public SbiBankAdapter(SbiBank sbiBank) {
        this.sbiBank = sbiBank;
    }
    @Override
    public Double checkBalance(String accountOne, String pin) {
        return sbiBank.getUserBalance(userInformation, accountOne, pin);
    }

    @Override
    public void transferMoney(String pin, double amount, String currency, String accountOne, String accountTwo) {
        if (sbiBank.getUserBalance(userInformation, accountOne, pin) >= amount) {
            sbiBank.transferFund(userInformation, accountOne, accountTwo, pin, amount);
        }
    }
}
