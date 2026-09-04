package O1_Patterns;
import java.util.*;

public class Pattern1 {

    static void pattern1(int n){
        for(int i=0;i<n;i++){                          // outer loop for rows
            for(int j=0;j<n;j++){                     //  inner loop for columns
                System.out.print("* ");
            }
            System.out.println();                     //  for change line
        }
    }



    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      pattern1(n);                                         // call a function.In leetcode dosen't need to write main function.
    }
}
