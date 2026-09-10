package O2_Basic_Maths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class O5_Print_all_divisors {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Logic 1,     but take more Time complexity.  |    TC = O(n)
   /*     for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }     */

        // Logic 2 .   Optimal approach that reduce TC.      |   TC = O(sqrt of n)

        // if n=6
        //  divisors -> 1*6 , 2*3 , 6
        //  they all numbers itself is a divisors of n.
        // so print both at one time .

        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                int d = n/i;
                if(d!=i){
                   divisors.add(d);
                }
            }
        }
        Collections.sort(divisors);             // TO arrange all divisors in sequence.
        for(int x: divisors){
            System.out.println(x + " ");         // print
        }
    }
}
