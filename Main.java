//this is for jenkins
import java.util.*;
public class Main
 {
    public static void main(String[] args)
 {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int x = Integer.parseInt(args[0]);
        
        System.out.println("Enter the second number:");
        int y =Integer.parseInt(args[1]); 
        
        int sum = x + y;
        System.out.println("Sum is " + sum);
    }
}