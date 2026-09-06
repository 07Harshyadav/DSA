package O1_Patterns;
import java.util.Scanner;

/*
                    *                          [space],[star],[space]
                   ***               at i=0      [2],    [1]  , [2]
                  *****
 */





public class Pattern5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){                                //outer loop for rows
            //space
            for(int j=1;j<=n-i;j++){                      // inner loop for space.
                System.out.print(" ");                   // print" " until -> (totalRows-presentRow)
            }
            //star
            for(int j=1;j<=2*i-1;j++){                     // inner loop for star.
                System.out.print("*");                     // print"*" until -> (2*presentRow-1)
            }
            //space                                     // here,no need to print space
            System.out.println();
        }
    }
}
