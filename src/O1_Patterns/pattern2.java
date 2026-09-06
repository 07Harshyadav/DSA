package O1_Patterns;
import java.util.*;

/*
            *
            * *
            * * *                                */


public class pattern2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){                         //outer loop for rows
            for(int j=1;j<=i;j++){                    // inner loop for colums,("j<=i" -> colums=rows.)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
