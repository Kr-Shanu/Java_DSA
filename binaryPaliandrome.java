import java.util.Scanner;
public class binaryPaliandrome {

    public static boolean paliandrome(int n){

        int copy = n, rev = 0, temp;

        while(copy>0){
            temp = copy%10;
            rev = rev*10 + temp;
            copy = copy/10;
        }

        System.out.println("Reverse of the number = "+rev);

        if(rev == n)
            return true;
        else
            return false;
    }

    public static int binary(int n){

        

        return 0;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number to check binary paliandrome.");
            int num = sc.nextInt();

            if(num<0)
            num = num*-1;

            String bin = Integer.toBinaryString(num);
            int binary = Integer.parseInt(bin);

            System.out.println("Binary of the number = "+ binary);

            if(paliandrome(binary))
                System.out.println("It is binary paliandrome");
            else
                System.out.println("Not a binary paliandrome.");

            System.out.println("Enter 0 to exit and any other number to continue");
            int temp = sc.nextInt();
            if(temp == 0)
            {
                System.out.println("Program exited successfully");
                break;
            }
        }

        sc.close();
    }
}