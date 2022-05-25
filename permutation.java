import java.util.Scanner;
public class permutation {
    
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void printArrayWord(char arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // Function to display the permutation of character
    public static void permuteWord(char arr[]){
        int i = 0, j;
        char temp;
        for(; i < arr.length; i++){ // for swapping n times
            j = i+1;
            for(int k = 0; k < (arr.length-1); k++, j++){ // (n-1) swapping will take place
                if(j == arr.length){
                    j = 0;
                }
                // swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // print array
                printArrayWord(arr);
            }
        }
    }

    // Function to display the permutation of integer numbers
    public static void permute(int arr[]){
        int i = 0, j, temp;
        for(; i < arr.length; i++){
            j = i+1;
            for(int k = 0; k < (arr.length-1); k++, j++){ // (n-1) swapping will take place
                if(j == arr.length){
                    j = 0;
                }
                // swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // print array
                printArray(arr);
            }
        }
    }
    public static void main(String args[]){

        // Taking input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        System.out.println("Enter the values of the arrray");
        int store[] = new int[l];
        for (int i = 0; i < l; i++) {
            store[i] = sc.nextInt();
        }

        System.out.println("Enter the length of the array containing characters");
        int lc = sc.nextInt();
        System.out.println("Enter the values of the arrray");
        char store_ch[] = new char[lc];
        for (int i = 0; i < lc; i++) {
            store_ch[i] = sc.next().charAt(0);
        }

        sc.close();
        System.out.println();


        permute(store);

        permuteWord(store_ch);

    }
}