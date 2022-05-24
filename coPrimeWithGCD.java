import java.util.Scanner;

public class coPrimeWithGCD {

    // function to find greatest common factor of two numbers.
    public static int GCD(int n, int m) {

        int min = (m > n) ? n : m;
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if ((n % i == 0) && (m % i == 0))
                gcd = i;
        }
        return gcd;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (GCD(n, i) == 1) {
                count++;
            }
        }

        System.out.println("The count of coprime for "+n+" = " + count);
    }
}