package O2_Basic_Maths;
import java.util.Scanner;

public class O1_Extration_of_digits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 123 -> extract 3 -> extract 2 -> extract -> extract 1.

        //logic
        while(n>0){
            int lastdig = n%10;
            System.out.print(lastdig);
            n = n/10;                               //update n after extract last digit.
        }

    }
}

             //   Time Complexity = O(log10 (n))

