package O3_Recursion;
import java.util.Scanner;

public class O6_Reverse_array {

    static void reverse(int[]arr,int i,int j){

        if(i>=j){               // i=0, j= arr.length-1;  when i is equal to j (if) is executed.
            return;
        }else{
            int temp = arr[i];                 // swap i and j.
            arr[i]=arr[j];
            arr[j]=temp;
                                                 // now first and last element is swap.
            reverse(arr,i+1,j-1);            // i+1 is second element and j-1 is second last element
        }
    }




    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int [size];           // create array with size elements.
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();            // take input until size.
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");         // print array in one line.
        }
        int i=0;                    // first element
        int j=arr.length-1;           // last element

        reverse(arr,i,j);           // ----> calling a func.

        System.out.println();                 // for new line

        for(i=0;i<size;i++){
            System.out.print(arr[i] + " ");         // print array that is reversed.
        }
    }
}
