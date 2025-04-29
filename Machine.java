
import java.util.*;

class ATM{
    float balance=9000.0f;
    int pin=5674;

    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc= new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if(enteredPin == pin){
            // calling menu function;
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }
    // menu function
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a optionn: ");
        int optionn = sc.nextInt();

        if(optionn==1) checkBalance();
        else if(optionn==2) withdrawMoney();
        else if(optionn==3) depositMoney();
        else if(optionn==4) return;
        else{
            System.out.println("ENTER A VALID NUMBER");
        }

    }
    public void checkBalance(){
        System.out.println("Your Balance : "+ balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount : ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>balance) System.out.print("Insufficient balance");
        else if(amount == balance || amount<balance){
            balance = balance-amount;
            System.out.print("Money Withdrawn");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter amount : ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        balance = balance+amount;
        System.out.print("Money deposited successfully!!");
    }

}

public class Machine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}


