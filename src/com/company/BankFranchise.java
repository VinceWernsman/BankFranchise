package com.company;

public class BankFranchise {

    public static void main(String[] args) {
	// wBank Franchise
        //Create a new project in IntelliJ named BankFranchise
        //Rename your Main file to BankFranchise(right-click -> Refactor -> Rename…)
        //Create a new Java class file (File -> New -> Java Class) named Bank
        //Give bank 2 properties
        //name
        //cashInVault
        //Create accessor methods for both properties
        //Create a method in Bank called Deposit
        //Deposit should take a parameter for amount to be deposited
        //Deposit should add the amount passed through its parameter to the property cashInVault
        //Deposit should print to the console stating the branch name, amount deposited, and current cash in the vault
        //Create a method in Bank called Withdrawal
        //Withdrawal should take a parameter for the amount to be withdrawn.
        //Withdrawal should subtract the amount passed through its parameter from the property cashInVault
        //Withdrawal should print to the console stating the branch name, amount withdrawn, and current cash in the vault
        //In BankFranchise instantiate 2 instances of Bank.
        //Give each bank a name using accessor methods
        //Give each bank a starting cashInVault value of 100,000 using accessor methods
        //Call the deposit and withdraw methods twice for each bank instance.


        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setNameBank("US BANK");
        bank2.setNameBank("Chase");

        bank1.setCashInVault(100000.0);
        bank2.setCashInVault(100000.0);



        bank1.withdraw(1000.0);
        bank2.withdraw(2000.00);

        bank1.withdraw(3000.0);
        bank2.withdraw(4000.00);

        bank1.deposit(5000.00);
        bank2.deposit(10000.00);

        bank1.deposit(500.00);
        bank2.deposit(600.00);




    }
