package O6_Array_easy;
import java.util.Scanner;


/*
         arr[] = [1,2,3,4,5,6]
         find the index of element 3.

          */

public class O1_Linear_Search {

    static void search(int[]arr,int size,int target){
        for(int i=0;i<size;i++){
            if(arr[i]==target){                   // if element equals to target.
                System.out.println(i);             //  print the index of that element.
                break;                           //  stop or break the loop because we dont need to run further.
            }
        }
    }








    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        search(arr,size,target);
    }
}
