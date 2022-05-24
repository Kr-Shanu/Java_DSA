// Block swap can be done in various ways, with much better and efficient algo,
// if you get it then do share it with us also, for the time being here is 
// the simplest code to add element in the update array 
import java.util.*;

public class blockSwapArray {

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1))
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    // simplest method to do so
    public static void simple(int arr[], int b) {

        int update[] = new int[arr.length], i, j;

        for (i = b, j = 0; i < (arr.length); i++, j++) {
            update[j] = arr[i];
        }

        for (i = 0; i < b; i++, j++) {
            update[j] = arr[i];
        }

        System.out.println("The updated array is as follows :");
        printArray(update);
    }

    public static void main(String args[]) {

        // Taking input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        System.out.println("Enter the values of the arrray");
        int store[] = new int[l];
        for (int i = 0; i < l; i++) {
            store[i] = sc.nextInt();
        }
        System.out.println("Enter the block size");
        int b = sc.nextInt();
        sc.close();

        printArray(store);

        simple(store, b);
    }
}
