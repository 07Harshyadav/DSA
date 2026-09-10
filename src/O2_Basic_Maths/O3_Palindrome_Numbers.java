package O2_Basic_Maths;
import java.util.*;

public class O3_Palindrome_Numbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // check 121 is palindrome -> compare reverseNUM & orginalNUM. if equal then it is palindrome.

        // Logic
        int orginalNum = n;
        int reverseNum =0;
        while(n>0){
            int lastdig = n%10;
            reverseNum = (reverseNum*10) + lastdig;
            n = n/10;
        }
        if(orginalNum==reverseNum){                      // compare orginamNUM & reverseNUM
            System.out.println("yes, this is palindrome");
        }else {
            System.out.println("No, this is not palindrome");
        }
    }
}
