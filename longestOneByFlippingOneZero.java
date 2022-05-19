// take a binary number from the user and flip any one zero and find the gretest number of 1's possible.
import java.util.Scanner;
public class longestOneByFlippingOneZero {
    
    public static int count(String str){
        int max = 0, i;

        for(i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                int j = i, countT = 0;

                for(j = i; j<str.length();j++){
                    if(str.charAt(j)== '1')
                    {
                        countT++;
                    }
                    else
                        break;
                }

                if(countT>max)
                    max = countT;

                i = j;
            }
            
        }
        return max;
    }


    public static int maxOnes(String str){

        int max = 0;

        for(int i = 0; i<str.length(); i++)
        {

            String newBin ;

            if(str.charAt(i) == '0')
            {
                newBin = str.substring(0, i) + "1" +str.substring(i+1, str.length());
                int no_of_ones = count(newBin);
                if(no_of_ones>max)
                    max = no_of_ones;
            }

        }

        return max;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number 8 to 16 digit long");
        String bin = sc.nextLine();
        sc.close();


        System.out.println("The maximum numbers of 1 possible = "+maxOnes(bin));


    }
}
