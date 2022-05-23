import java.util.Scanner;
public class selectionSort {

    // Function to display descending order of array using selection sort
    public static void descending(int arr[], int n){
        int i, j, max = -2147483648;
        int index = 0; 

        for(i = 0; i < n; i++){

            for(j = i; j < n; j++){

                if(arr[j]>max){
                    max = arr[j];
                    index = j;
                }
            }

                // swap the values of i with index
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                max = -2147483648;
            }

        // printing of sorted array
        System.out.println("Sorted array in descending order : ");
        for(i = 0; i < n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    // Function to display ascending order of array using selection sort
    public static void ascending(int arr[], int n){
        int i, j, min = 2147483647;
        int index = 0; 

        for(i = 0; i < n; i++){

            for(j = i; j < n; j++){

                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }

                // swap the values of i with index
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                min = 2147483647;
            }

        // printing of sorted array
        System.out.println("Sorted array is ascending order");
        for(i = 0; i < n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // Taking input from the user.
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        sc.close();

        ascending(arr, n);
        descending(arr, n);

    }
}
