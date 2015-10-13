import java.io.*;
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,x=1;
        System.out.println("Enter a number:");
        n = in.nextInt();

        for(int i = 1; i <= n; i++){
           x  *=  i;
        }
        System.out.println("Factorial is :"+ x);
    }
}
