package O1_Patterns;
import java.util.Scanner;

/*
                                 * * *
                                 *   *
                                 * * *
 */



public class Pattern9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int star=1;

            if(i==1||i==n){
                for(int j =1;j<=n;j++){
                    System.out.print("* ");
                }
            }
            if(i>1&& i<n){
                for(int j =1;j<=1;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=n-2;j++){
                    System.out.print("  ");
                }
                for(int j =1;j<=1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
