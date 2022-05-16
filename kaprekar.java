// Need to correct this code asap.
import java.util.*;
public class kaprekar {

    public static int digits(int num){
        int digit = 0;
        while(num>0)
        {
            num/=10;
            digit++;
        }
        return digit;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        int sq = k*k;

        int digit = digits(k); 
        int sq_digit = digits(sq);

        
        System.out.println("Number of digit of number = " +digit);
        System.out.println("Number of square digits = " + sq_digit);

        int left = sq_digit-digit;
        System.out.println("Left digits = "+ left);

        int left_sum = (int)(sq/(Math.pow(10, left)));
        int right_sum = (int)(sq%(Math.pow(10, digit)));

        System.out.println("Left sum = "+ left_sum);
        System.out.println("right sum = "+ right_sum);

        if((left_sum+right_sum) == k)
            System.out.println("Yes it is kaprekar number");
        else
            System.out.println("Not a kaprekar number");
    }
}