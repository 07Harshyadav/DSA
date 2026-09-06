package O1_Patterns;
import java.util.Scanner;


/*
               1
               12
               123

 */

public class Pattern3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){                    // print j until reach to i.
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
