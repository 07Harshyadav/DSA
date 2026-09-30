package O6_Array_easy;
import java.util.Scanner;

public class O2_Largest_Element {


    static void largest(int[]arr,int size){
        int largest = 0;                      // initially we assume largest element is at index 0.

        for(int i=0;i<size;i++){
            if(arr[i]>arr[largest]){
                largest =i;                     // if we find large element than we assumed largest ,then store its index in largest.
            }
        }
        System.out.println(arr[largest]);        // after completing loop we get largest index. so we print element at that index.
    }





    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        largest(arr,size);           // calling a function.
    }
}
