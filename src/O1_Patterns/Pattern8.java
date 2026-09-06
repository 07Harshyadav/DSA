package O1_Patterns;
import java.util.Scanner;


/*
                   *    *
                   **  **
                   ******
                   **  **
                   *    *
 */






public class Pattern8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){                     //  first half

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=n*2-i-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1;i<n;i++){                                 //   second half

            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
