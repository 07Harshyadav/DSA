package O2_Basic_Maths;
import java.util.Scanner;

public class O4_Armstrong_Number {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // armstrong number
        // 371 => (3cube + 7cube + 1cuber) .  is equal to orginalNumber 371.

        //logic
        int sum =0;
        int orgNUM = n;
        while(n>0){
            int ld = n%10;
            sum = sum +(ld*ld*ld);          // storing ld(cube) in sum in iteration.
            n= n/10;
        }
        if(sum==orgNUM){
            System.out.println("Yes, it is Armstrong");
        }else{
            System.out.println("No, it is not Armstrong");
        }
    }
}
