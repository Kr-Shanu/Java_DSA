// Manachers is a way to check the paliandrome, where we split the word into two
// and then we check the digits on left and right one by one and evaluate whether
// the given word is paliandrome or not.

import java.util.Scanner;

public class Manachers {
    public static boolean paliandrome(String str) {
        int length = str.length(), i;
        boolean result = true;
        int sign, value;
        if (length % 2 == 0) {
            sign = 1;
            value = 0;
        }else
        {
            sign = -1;
            value = 1;
        }
        for (i = 0; i < (length / 2); i++) {
            if (str.charAt((length / 2) + (i*sign) - 1) != str.charAt((length / 2) + i + value)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        sc.close();
        if (paliandrome(word))
            System.out.println("The given word is paliandrome");
        else
            System.out.println("The given word is not a paliandrome");
    }
}