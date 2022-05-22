// Logic 
// first take the last element of the 


import java.util.*;
public class leaderInAnArray {


    public static void leader(int arr[], int size){
        int max = arr[size-1];

        System.out.println("Leader values are :");
        for(int i = (size-2); i>=0; i++){

            if(arr[i]>max)
            {
                max = arr[i];
                System.out.println(max);
            }

        }
    }


    public static void leaderNestedLoop(int store[], int l){
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(store[l-1]);
        for(int i = l-2; i>=0; i--){
            if(store[i]>store[l-1]){
                boolean found = true;
                for(int j = i; j< l; j++){
                    if(store[j]>store[i])
                    {
                        found = false;
                        break;
                    }
                }
                if(found){
                    leaders.add(store[i]);
                }
            }
        }
        System.out.println("leaders are = "+ leaders);
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = sc.nextInt();
        int store[] = new int[l];

        System.out.println("Enter the array elements");
        for(int i = 0; i<l; i++){
            int temp = sc.nextInt();
            store[i] = temp;
        }
        sc.close();
    }
}