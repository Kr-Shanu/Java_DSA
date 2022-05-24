import java.util.Scanner;

public class moveTheHyphenToTheStart {

    // function to return the substring
    public static String sub(String str, int start, int end){
        String result = "";
        for(int i = start; i < end ;i++){
            result = result + str.charAt(i);
        }
        return result;
    }

    // function using custom function
    public static void printWithoutHyphen(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-')
                str = "-" + sub(str,0, i) + " " + sub(str, i + 1, str.length());
        }
        System.out.println("Output :");
        System.out.println(str);
    }

    // function using string.substring method
    public static void printWithoutHyphenUsingSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-')
                str = "-" + str.substring(0, i) + " " + str.substring(i + 1, str.length());
        }
        System.out.println("Output :");
        System.out.println(str);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with hyphen");
        String sentence = sc.nextLine();
        sc.close();
        printWithoutHyphen(sentence);
        printWithoutHyphenUsingSubstring(sentence);
    }
}

//  Evaluation => The substring, predefined function is faster than the custom function 