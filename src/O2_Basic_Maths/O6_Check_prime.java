package O2_Basic_Maths;
import java.util.Scanner;

public class O6_Check_prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Logic

        int count =0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Yes , it is a Prime number");
        }else{
            System.out.println("No , it is a Prime number");
        }
    }
}
