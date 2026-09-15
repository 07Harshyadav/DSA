package O3_Recursion;
import java.util.Scanner;



public class O5_Factorial {

    static int fact(int n){

        if(n<1){
            return 1;
        }
        return n* fact(n-1);         // before return they call fact with n-1.
    }                                   // this repeats until if return 1 and then multiply n with n-1 and return it.



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));          // calling a func and print it after return a value given by fact function.

    }
}
