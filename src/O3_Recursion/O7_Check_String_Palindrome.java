package O3_Recursion;
import java.util.Scanner;

public class O7_Check_String_Palindrome {

    static boolean palindrome(String s,int i){
     if(i>=s.length()/2){                                 // if is executed when i reach to half of string
         return true;
     }
     if(s.charAt(i)!=s.charAt(s.length()-1-i)){          // check first and last letter.
         return false;
     }
         return palindrome(s,i+1);                     // calling repeatedly until if is executed.
    }






    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i=0;

        System.out.println( palindrome(s,i));    // calling a function with string and i=0.
    }
}
