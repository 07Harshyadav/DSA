package O2_Basic_Maths;
import java.util.Scanner;


public class O2_Reverse_the_numbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               // taking input

        //logic
       int reverseNum =0;
        while(n>0){
            int lastdig = n%10;
             reverseNum = (reverseNum*10) + lastdig;     //  1. 0*10+lastdig =lastdig | 2. lastdig*10+lastdig = first_lastdig & second_lastdig. (this process repeats)
             n = n/10;
        }
        System.out.print(reverseNum + " ");            // print reverseNum.
    }
}
