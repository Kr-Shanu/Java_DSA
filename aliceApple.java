// There are different kinds of apple trees in the four directions 
// (East, West, North, South), which may grow both red and green apples 
// such that each tree grows exactly K apples, in the following manner:

// N – number of trees to the north do not have red apples.
// S – number of trees to the south do not have green apples.
// W – number of trees in the west have some red apples.
// E – number of trees in the east have some green apples.

// M - number of red apples required
// K - number of apple a tree has

import java.util.Scanner;

public class aliceApple {

    public static int redAppleRequirement(int n, int s, int e, int w, int k, int m) {

        int minimumApple = 0;

        if (((s * k) + e) >= m) {
            if (m <= (s * k)) {
                minimumApple = m;
            } else {
                minimumApple = s * k + (m - s * k) * k;
            }
            return minimumApple;
        } else
            return -1;
    }

    public static int greeenAppleRequirement(int n, int s, int e, int w, int k, int m) {

        int minimumApple = 0;

        if (((n * k) + w) >= m) {
            if (m <= (s * k)) {
                minimumApple = m;
            } else {
                minimumApple = n * k + (m - s * k) * k;
            }
            return minimumApple;
        } else
            return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the value of N");
            int n = sc.nextInt();
            System.out.println("Enter the value of S");
            int s = sc.nextInt();
            System.out.println("Enter the value of E");
            int e = sc.nextInt();
            System.out.println("Enter the value of W");
            int w = sc.nextInt();
            System.out.println("Enter the value of K");
            int k = sc.nextInt();
            System.out.println("Enter the value of M");
            int m = sc.nextInt();

            System.out.println("Enter 1 to check Red Apple Requirement and 2 for green");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(
                            "Total number of apples required to be plucked = " + redAppleRequirement(n, s, e, w, k, m));
                    break;
                case 2:
                    System.out.println("Total number of apples required to be plucked = "
                            + greeenAppleRequirement(n, s, e, w, k, m));
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    continue;
            }

            System.out.println();
            System.out.println("Enter 0 to exit or any other number to continue");
            int exit = sc.nextInt();

            if (exit == 0) {
                System.out.println("Program exited successfully.");
                break;
            }

        }
        sc.close();
    }
}