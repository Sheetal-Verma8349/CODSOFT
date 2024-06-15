/*
        CodSoft
        Sheetal Verma
        Task 3
        */
import java.util.*;
class UserAccount
{
    float balance=10000;
    int PIN=1888;
}
class ATM extends UserAccount
{

    int choice;
    //To take input from user,I created Scanner class object
    Scanner sc=new Scanner(System.in);
    void show()

    {System.out.println("\n                * * *   WELCOME TO ATM SYSTEM * * *  ");
    }
    public void checkPin()
    {
        System.out.print("\nEnter your PIN :");
        int userPin=sc.nextInt();
        if(userPin==PIN) {
            menu();
        }
        else {
            System.out.println("INVALID PIN ,Please enter valid Pin !");
            checkPin();
        }
    }
    void accountBalance()
    {
        System.out.println("\nYour Account Balance is :"+balance);
    }
    void withdrawal()
    {
        System.out.print("Enter amount to withdrawal : ");
        float with_amount = sc.nextInt();
        if(with_amount<=balance) {
            System.out.println("Money withdrawal successfully  ");
            balance = balance - with_amount;
            System.out.println("Amount left : " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    void deposit()
    {
        System.out.print("\nEnter amount to Deposit :");
        int amountDeposit=sc.nextInt();
        System.out.println("Amount deposited successfully ");
        balance=balance+amountDeposit;
        System.out.println("Total Amount  :"+balance);
    }
    void menu() {
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("------------------------------------------------------------------");
        System.out.print("\nEnter your choice  :");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                accountBalance();
                System.out.println("------------------------------------------------------------------");
                menu();
                break;}

            case 2: {
                withdrawal();
                System.out.println("------------------------------------------------------------------");
                menu();
                break;
            }
            case 3: {
                deposit();
                System.out.println("------------------------------------------------------------------");
                menu();
                break;
            }
            case 4: {
                System.out.println("  * * *  THANK YOU FOR VISIT  * * *");
                break;
            }
        }
    }
}

public class task33 {
    public static void main(String arg[])
    {
        ATM a=new ATM();
        a.show();
        a.checkPin();
    }
}
