import java.util.Scanner;

public class hourGlass {

    public static int hourGlassMaxSum(int arr[][], int col, int row) {
        int i = 0, j = 0, k;
        int a, b, c, d, e, f, g, add = 0, max = -1;
        for (k = 1; k <= ((col - 2) * (row - 2)); k++) {
            a = arr[i][j];
            b = arr[i][j + 1];
            c = arr[i][j + 2];
            d = arr[i + 1][j + 1];
            e = arr[i + 2][j];
            f = arr[i + 2][j + 1];
            g = arr[i + 2][j + 2];
            j++;
            System.out.println("Iteration number = : " + k);
            System.out.print("a = " + a + ": b = " + b + ": c = " + c + ": d = " + d + ": e = " + e + ": f = " + f
                    + ": g = " + g);
            System.out.println();
            add = a + b + c + d + e + f + g;
            System.out.println("Sum = " + add);
            if (add > max) {
                max = add;
            }
            if (k % (col - 2) == 0) {
                j = 0;
                i++;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        System.out.println("Enter the number of row");
        int r = sc.nextInt();
        int matrix[][] = new int[r][c];
        int temp, i, j;
        // Taking value from the user :
        System.out.println("Enter the array elements:");
        for (i = 0; i < r; i++) {
            System.out.println("Enter the element of " + (i + 1) + "th row");
            for (j = 0; j < c; j++) {
                temp = sc.nextInt();
                matrix[i][j] = temp;
            }
        }
        // To look into what user has entered :
        System.out.println("Data entered by the user");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("The maximum sum of the hourglass = " + hourGlassMaxSum(matrix, c, r));
    }
}