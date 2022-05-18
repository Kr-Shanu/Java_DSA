// Greatest common devisor
import java.util.Scanner;
public class gcd {

    public static int greatestcd(int a, int b){
        int quotient = a/b;
        int remainder = a%b;

        if(remainder==0){
            return quotient;
        }
        else
        {
            return greatestcd(b, remainder);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
                System.out.println("GCD = "+ greatestcd(a,b));
            else
                System.out.println("GCD = "+ greatestcd(b,a));
            
            System.out.println("Enter 0 to exit and any other number to continue");
            int temp = sc.nextInt();
            if(temp == 0)
            {
                System.out.println("Program exited successfully");
                break;
            }
        }
        sc.close();
    }
}
