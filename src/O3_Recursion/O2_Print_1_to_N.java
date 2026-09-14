package O3_Recursion;
import java.util.Scanner;

public class O2_Print_1_to_N {

    static void print(int N){
        if(N<1){                            //  now N=5, so if is not executed.
            return;
        }else{
            print(N-1);                       // call same function with N-1.
            System.out.println(N);             // printing start when if is executed.
        }
    }

       // Logic
    /*
     let N=3;
     if(3<1)       --N=3--                 (false) so if is not executed.
     print(2)  --                         calling func with N-1
                 |--->    if(2<1)     (false)            --N=2--
                          print(1) --
                                     |---> if(1<1)       (false)    -- N=1--
                                           print(0) ---
                                                       |---> if(0<1).  (true) , so they return;

 ----->           now print from last iteration  .
                  in the last iteration N=1. so print 1
                  then back to previous iteration where N=2, so print 2
      */





    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        print(N);                                  // calling the function with N.
    }
}
