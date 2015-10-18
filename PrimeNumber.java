import java.util.*;
public class PrimeNumber{
    public static void main(String args[])
    {
        int n, check=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");

         n = in.nextInt();

        for(int i = 2; i<n; i++){
            if(n%i == 0){
                check = 1;
                break;
            }
        }

        if (check == 0) {
            System.out.println("This is a prime number!");
        }else{
            System.out.println("This is not a prime number!");
        }
    }
}
