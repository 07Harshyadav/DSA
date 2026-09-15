package O3_Recursion;
import java.util.Scanner;




public class O3_Print_N_to_1 {

    static void print(int N){
        if(N<1){
            return;
        }else{
            System.out.println(N);    // in this we print before calling.Now N=5
            print(N-1);                     // N=4
        }
    }




    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print(N);                  // calling a func.
    }
}
