import java.util.*;
public class majorityElements {
    
    public static void main(String args[]){

        ArrayList<Integer> store = new ArrayList<>();
        ArrayList<Integer> checked = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int l = sc.nextInt();
        System.out.println("Enter the array elements");

        for(int i = 0; i<l; i++){
            int temp = sc.nextInt();
            store.add(temp);
        }

        sc.close();

        for(int i = 0; i<l; i++){
            if(checked.contains(store.get(i))){
                continue;
            }
            else{
                int count = 0;
                for(int j = i; j < l;j++){
                    if(store.get(i) == store.get(j)){
                        count++;
                        
                    }
                    else
                    {
                        break;
                    }
                    
                }
                counter.add(count);
                checked.add(store.get(i));
            }
        }

        int max = counter.get(0);
        int index = 0;
        for(int i = 1; i < counter.size(); i++){

            if(counter.get(i)>max){
                max = counter.get(i);
                index = i;
            }
        }

        System.out.println("Value of max = "+ max);
        System.out.println("Value of index = "+ index);

        if(max>(l/2)){
            System.out.println("The maximum elemet = "+ checked.get(index)+" at a maximum number of times = "+ counter.get(index));
        }
        else
        {
            System.out.println("MAximum element not possible");
        }
    }
}
