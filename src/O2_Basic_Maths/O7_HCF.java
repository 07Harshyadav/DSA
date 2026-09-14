package O2_Basic_Maths;

import java.util.Scanner;

public class O7_HCF {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        // Highest Common Factor

        // Logic
       while(n1>0 && n2>0){                    //  core logic. let a=52, b=10
           if(n1>n2){
               n1 = n1%n2;                      //   large % small , repeat until one of them are 0.
           }else{
               n2=n2%n1;
           }

       }
        if(n1==0){                                    //    the other one non zero is HCF.
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }
    }
}

// Time Complexity = O(log(fi)(min(a,b))).         fi=smaller
// if ther is division inside itrations tc will calculated in log.