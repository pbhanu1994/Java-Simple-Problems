import java.io.*;
import java.util.*;
public class Amstrong {
    public static void main(String args[]){
        int n,s=0,p=0,flag;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");

        n = in.nextInt();
        flag = n;
        while(n>0){
            s = n%10;
            p = p+s*s*s;
            n = n/10;
        }
        if(p == flag){
            System.out.println("It's an Amstrong Number!");
        }else{
            System.out.println("Not an Amstrong Number :(");
        }
    }
}
