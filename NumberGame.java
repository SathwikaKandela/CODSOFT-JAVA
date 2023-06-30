

import java.util.Scanner;
import java.util.Random;
public class NumberGame {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int count=0;
       int i;
       for(int j=1; ;j++)
       {
        System.out.println("-----Round "+j+"-----");
        Random rand=new Random();
       int int_random=rand.nextInt(100);
       for(i=1;i<=5;i++) //Limiting the number of attempts to five
       {    
        System.out.println("enter the guessed number");
       int guess_num=sc.nextInt();
       if(guess_num>int_random)
           System.out.println("Too High");
       else if(guess_num<int_random)
           System.out.println("Too Low");
       else
       {
           System.out.println("Correct");
           count++;
           break;
       }
       }
       System.out.println("Number of attempts taken in Round "+j+" is "+(i-1));
       System.out.println("-----------------------");

       System.out.println("Do yo want to play again,enter 1");
       int n=sc.nextInt();
       if(n==1) 
       {
           System.out.println();
       } 
       else 
           break;
    }
       System.out.println("Number of rounds won: "+count);
    }
    
}
