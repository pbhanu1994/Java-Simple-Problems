import java.io.*;
import java.util.*;
public class SumOfDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,c,rem,p=0;

        System.out.println("Enter the number:");
        n = in.nextInt();
        c= n;
        while(n>0){
            rem = n%10;
            p += rem;
            n = n/10;
        }
        System.out.println("The Sum of "+c+" is :"+p);
    }
}
