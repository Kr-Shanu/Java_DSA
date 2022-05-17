import java.util.*;
public class coPrime {

    public static int coPrimeSum(int n){

        int i, sum = 1;
        boolean coprime = true;
        ArrayList<Integer> factor = new ArrayList<>();

        for(i = 2; i<=n; i++)
        {
            if(n%i == 0)
                factor.add(i);
        }

        for(i = 2;i<n;i++){
            
            for(int j = 2; j <= i; j++)
            {
                if((i%j == 0))
                {
                    if(factor.contains(j)==true)
                    {
                        coprime = false;
                        break;
                    }
                    else
                    {
                        coprime = true;
                    }
                }
            }
            if(coprime==true)
            {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            System.out.println("The sum of co-prime = "+coPrimeSum(num));

            System.out.println("Enter 0 to exit or any other number to continue");
            int exit = sc.nextInt();
            if(exit == 0)
                break;
        }
        sc.close();
    }
}