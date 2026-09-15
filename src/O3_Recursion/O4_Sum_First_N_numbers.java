package O3_Recursion;
import java.util.Scanner;

public class O4_Sum_First_N_numbers {

    static int sum(int N){              // here return is nessecery because of int.
        if(N<1){
            return 0;
        }
        return N +sum(N-1);            // present N + calling same func with N-1.
    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(sum(N));              // calling a function. AND after return ans print it.

    }
}
