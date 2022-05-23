// take input
// check length of input
// check frequency
// check palinadrome
// output
// can even exclude even count 
import java.util.*;
public class lexicographicPaliandrome {

    public static int frequency(String a, char b){

        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b)
                count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        sc.close();

        int length = word.length();

        int oddCount = 0;

        for(int i = 0; i < word.length(); i++){
            int f = frequency(word, word.charAt(i));
            if(f%2 != 0)
                oddCount++;
        }

        if(length%2==0){
            if(oddCount == 0)
                System.out.println("Lexicographic paliandrome possible");
            else
                System.out.println("Lexicographic paliandrome not possible");
            }
            else
            {
                if(oddCount == 1)
                    System.out.println("Lexicographic paliandrome possible");
                else
                    System.out.println("Lexicographic paliandrome not possible");
            }
        }
    }