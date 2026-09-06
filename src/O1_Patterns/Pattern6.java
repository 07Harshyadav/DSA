package O1_Patterns;
import java.util.Scanner;

/*
                        *
                        **
                        ***
                        **
                        *
 */


public class Pattern6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){                       // total rows is (2*rows-1).
            int stars = i;
            if (i > n) {
                stars= 2*n-i;                          // if present row is greater then totalRows
            }                                         //  then stars will decrease.
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
