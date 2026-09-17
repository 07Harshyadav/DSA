package O3_Recursion;

import java.util.Scanner;

public class O8_Fabonacci_number {

    // Fabonaaci => 3(position) => priviousPosition + double  priviousPosition

    static int fab(int n){
        if(n<=1){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fab(n));          // calling a func inside printing.
    }
}


// TC => O(2^n)  .     for each element there is two func calling.
