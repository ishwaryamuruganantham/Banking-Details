package BankDetails;
import java.util.Scanner;
interface BankDetail{
    public void display();
}
class Bank {
    protected String bankName = "Canara Bank - Kumbakonam";
    String location = "Kumbakonam";

    Bank() {
        this.bankName = bankName;
    }

    final void rule() {
        System.out.println("______________________");
        System.out.println("Canara Bank - Kumbakonam");
        System.out.println(" main rule--minimum balance:Rs.500");
        System.out.println("----------------------");
    }

}
public class CustomerDetails extends Bank implements BankDetail{
    Scanner sc=new Scanner(System.in);
    private String customerName ="Ishwarya";
    public int accountNumber=78964876;
    double balance=10000;
    final int minimum_Balance =500;
    CustomerDetails()
    {
        super();
    }
    void displayDetails()
    {
        System.out.println("_____________________");
        System.out.println("Bankname:"+bankName);
        System.out.println("Location:"+location);
        System.out.println("Minimum balance - Rs.500");
        System.out.println("customerName:"+customerName);
        System.out.println("Account Number:"+accountNumber);

        System.out.println("Balance:"+this.balance);
    }
    public void choice()
    {

        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.balance");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("------------------------");
                System.out.println("balance - "+balance);
                System.out.println("Enter amount to withdraw:");
                int amount = sc.nextInt();
                if (balance - amount >= minimum_Balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw Successful");
                    System.out.println("withdraw:" + amount);
                    System.out.println("Available Balance:" + balance);
                    System.out.println("______________________");
                } else {
                    System.out.println("Withdraw Failed - Insufficient Balance");
                }
                break;
            }

            case 2:
            {
                System.out.println("_______________________");
                System.out.println("balance:"+balance);
                System.out.println("Enter amount to deposit:");
                int amount = sc.nextInt();
                if (balance + amount >= minimum_Balance) {
                balance = balance + amount;
                System.out.println("Deposit Successful");
                System.out.println("deposit:" + amount);
                System.out.println("Available Balance:" + balance);
                System.out.println("______________________");
                } else {
                    System.out.println("Deposite  - Insufficient Balance  ");

                }
                break;
            }
            case 3:
                {
                System.out.println("Available Balance:" + balance);
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }
    }
   public void display()
    {
        System.out.println("___________THANK YOU____________");
    }
}
class DisplayMain
{
    public static void main(String[] args) {
        CustomerDetails obj=new CustomerDetails();
       obj.rule();
       obj.choice();
       obj.displayDetails();
       obj.display();
    }

}
