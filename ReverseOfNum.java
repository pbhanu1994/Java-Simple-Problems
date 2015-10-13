import java.util.*;
import java.io.*;
public class ReverseOfNum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,rem,p=0,c;
        System.out.println("Enter the number:");
        n = in.nextInt();
        c = n;

        while(n>0){
            rem  = n%10;
            p = (p*10) + rem;
            n = n/10;
        }
        System.out.println("The reverse of a number for "+c+ " is: "+p);
    }
}
