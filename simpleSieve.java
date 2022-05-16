import java.util.*;
public class simpleSieve {

    public static void prime(int arr[], int n) {

        if (arr[0] == n || arr[0] == -1)
            return;
        else {

            int newArray[] = new int[n];
            int j = 0, count = 0, i;

            for (i = 1; i < arr.length; i++) {
                if (arr[i] % arr[0] != 0) {
                    count++;
                    newArray[j++] = arr[i];
                }
            }

            System.out.print(arr[0] + ", ");

            for (i = (count - 1); i < n; i++) {
                newArray[i] = -1;
            }

            prime(newArray, n);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        int container[] = new int[n];
        for (int i = 2, j = 0; i <= n; i++) {
            container[j] = i;
            j++;
        }

        System.out.println("The prime number between 2 to " + n + " are :");
        prime(container, n);

    }
}