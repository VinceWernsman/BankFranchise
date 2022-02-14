package com.company;

public class Bank {

    private String nameBank;
    private double cashInVault;

    public void setNameBank(String newName){
        nameBank = newName;
    }

    public String getNameBank() {
        return nameBank;
    }



    public void setCashInVault(double newCash) {
        cashInVault = newCash;
    }

    public double getCashInVault() {
        return cashInVault;
    }

    //Create a method in Bank called Deposit
    //Deposit should take a parameter for amount to be deposited
    //Deposit should add the amount passed through its parameter to the property cashInVault
    //Deposit should print to the console stating the branch name, amount deposited, and current cash in the vault


    public void deposit(double newDeposit){
        cashInVault = newDeposit +cashInVault;
        System.out.println(nameBank + " has accepted a deposit of " + newDeposit + ", the updated balance is " + cashInVault);
    }
//Create a method in Bank called Withdrawal
    //Withdrawal should take a parameter for the amount to be withdrawn.
    //Withdrawal should subtract the amount passed through its parameter from the property cashInVault
    //Withdrawal should print to the console stating the branch name, amount withdrawn, and current cash in the vault

     public void withdraw(double newWithdraw){
        cashInVault = cashInVault - newWithdraw;
        System.out.println(nameBank + " has accepted a withdraw of " + newWithdraw + ",  the updated balance is " + cashInVault);
     }

}
