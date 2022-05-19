import java.util.Scanner;

public class reverseBinary {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers");
        int a = sc.nextInt();
        sc.close();


        String a_bin = Integer.toBinaryString(a);

        if(a_bin.length()<8){

            for(int i =0; i<=(8-a_bin.length()); i++){
                a_bin = "0" + a_bin;
            }
            System.out.println("a_bin = " +a_bin);
        }


        String newNum = a_bin.substring(4, 8) + a_bin.substring(0,4);
        System.out.println("new Number = " +newNum);


        int decimal=Integer.parseInt(newNum,2);
        System.out.println("The decimal value of the new number = "+ decimal);

    }
}