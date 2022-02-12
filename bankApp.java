package first;

import java.util.Scanner;

//creating the account class for the application
class Account{

    double newBalance;
    String userName;

    Account(String name){ //creating the constructor
        userName = name;
    }

    void withdraw (double amount){
        if(amount != 0){
            newBalance = newBalance - amount;
        }
    }
    void deposit(double amount){
        if(amount != 0){
            newBalance = newBalance + amount;
        }
    }

    void menuList(){ // this will greet the customer and display their options
        Scanner scnr = new Scanner(System.in);
        int action;

        System.out.println("Welcome, "+ userName + " what would you like to do?");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        do{ //creating a loop to prompt the user until the user is done with their transactions.
            System.out.println("==========");
            System.out.println("Select an option");
            System.out.println("==========");
            action = scnr.nextInt();

            switch (action){

                case 1:
                    System.out.println("Enter withdraw amount: ");
                    double amount = scnr.nextDouble();
                    withdraw(amount);
                    break;

                case 2:
                    System.out.println("Enter deposit amount: ");
                    double amount2 = scnr.nextDouble();
                    deposit(amount2);
                    break;

                case 3:
                    System.out.println("==========");
                    System.out.println("Balance is: $" + newBalance);
                    System.out.println("==========");
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default: //if any other number is entered, that is not 1-4, this message will display
                    System.out.println("Invalid choice, please select what you would like to do.");
                    break;
            }
        }
        while(action != 4); //this keeps the loop iterating until the user enters 4 to exit

        System.out.println("Thank you! have a great day!");
    }
}

public class bankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String cname = scanner.nextLine(); // having the user enter their name


        Account obj1 = new Account(cname);//assigning the account name to the users name
        obj1.menuList();
    }
}

