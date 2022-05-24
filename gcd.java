
// Greatest common devisor
import java.util.Scanner;

public class gcd {

    // Recursive function to return gcd of a and b
    // code from gfg
    public static int GCD(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return GCD(a - b, b);
        return GCD(a, b - a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("GCD = " + GCD(a, b));


            System.out.println("Enter 0 to exit and any other number to continue");
            int temp = sc.nextInt();
            if (temp == 0) {
                System.out.println("Program exited successfully");
                break;
            }
        }
        sc.close();
    }
}