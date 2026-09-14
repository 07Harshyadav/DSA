package O3_Recursion;

import java.util.Scanner;

public class O1_Print_name_N_times {

    static void printName(int n){
        if(n==0){
            return;                             // when n=0. then return
        }else{
            System.out.println("harsh");
            printName(n-1);                 // we calling same func with reduced n by 1
        }
    }





    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);                      // Calling the function with n.
    }

}
