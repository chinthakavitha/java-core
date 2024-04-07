package com.learningcore.day2.session2.exception.ps6;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class D02P06p1 {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public D02P06p1(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;

        if (accType.equalsIgnoreCase("saving") && initialBalance < 1000) {
            throw new LowBalanceException("Low Balance");
        } else if (accType.equalsIgnoreCase("current") && initialBalance < 5000) {
            throw new LowBalanceException("Low Balance");
        } else if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equalsIgnoreCase("saving")) {
            throw new LowBalanceException("Low Balance");
        } else if (balance < 5000 && accType.equalsIgnoreCase("current")) {
            throw new LowBalanceException("Low Balance");
        }
        return balance;
    }

    public static void main(String[] args) {
        try {
        	D02P06p1 account = new D02P06p1(123, "John", "Saving", 900);
            account.deposit(200);
            System.out.println("Balance: " + account.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}

