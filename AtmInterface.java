import java.util.*;
class atm
{
    void deposit(double deposit)
    {
        System.out.println("Amount Deposited : "+deposit);
    }
    void withdraw(double withdraw)
    {
        System.out.println("Amount withdrawn : "+withdraw);
    }
    void checkBalance(double balance)
    {
        System.out.println("Available Balance : "+balance);
    }
           
}
public class AtmInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the available users balance");
        double balance=sc.nextDouble();
        if(balance>0)
        {
            System.out.println("--------SELECT AN OPTION----------");
            System.out.println("1. Withdraw     ");
            System.out.println("2. Deposit      ");
            System.out.println("3. Check Balance");
            System.out.println("----------------------------------");
            int num=sc.nextInt();
            switch(num)
            {
                case 1:
                       System.out.println("enter the amount to be withdrawn");
                       double withdraw=sc.nextDouble();
                       if(withdraw<=balance)
                       {
                           atm a=new atm();
                           a.withdraw(withdraw);
                           balance=balance-withdraw;
                           a.checkBalance(balance);
                       }
                       else
                       {
                           System.out.println("Insufficient balance");
                       }
                       break;
                case 2:
                       System.out.println("enter the amount to be deposited");
                       double deposit=sc.nextDouble();
                       atm b=new atm();
                       b.deposit(deposit);
                       balance=balance+deposit;
                       b.checkBalance(balance);
                       break;
                case 3:
                       atm c=new atm();
                       c.checkBalance(balance);
                       break;
                default :
                       System.out.println("Enter the valid option");
                       
            }
        }
        else
            System.out.println("Please make sure your available balance is greater than zero");
    }
    
}
