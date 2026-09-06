package O1_Patterns;
import java.util.Scanner;

/*
                                 33333
                                 32223
                                 32123
                                 32223
                                 33333
 */




public class Pattern10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orginalN= n+1;
        for(int i=1;i<=2*n-1;i++){
            for(int j =1;j<=2*n-1;j++){
                int digit = Math.min(Math.min(i,j), Math.min((2*n-1)-i+1,(2*n-1)-j+1)); // Understand this only.
                System.out.print(orginalN-digit);
            }
            System.out.println();
        }
    }
}
