package O5_Sorting;
import java.util.Scanner;


/*
       Rules
             1. choose a pivot . (arr[low])  --->  that become partion
             2. put smaller element than pivot on the left side.
             3. put greater element than pivot on the right side.

             now pivot at its correct place.
 */






public class O5_Quick_sort {

    static void sort(int[]arr,int low,int high){
        if(low<high) {
            int partion = f(arr, low, high);            // calling f . its return value become partion.
            sort(arr,low,partion-1);             // on the left side do same thing. (by recursion )
            sort(arr,partion+1,high);             // on the right side do same thing
        }
    }

    static int f(int[]arr,int low,int high){
     int i=low;           // i pointer
     int j=high;         // j pointer
     int pivot=arr[low];                               // choose first element as pivot.

     while(i<j){
         while(i<=high && arr[i]<=pivot){             // find greater than pivot and stop.
             i++;
         }
         while( j>=low&& arr[j]>pivot){                 // find smaller than pivot and stop.
             j--;
         }
         if(i<j){                                    // now swap arr[i] && arr[j]
             int temp = arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
     }
     int temp = arr[low];                       // after completing the loop. swap j & low because at low postion there is pivot.
     arr[low] = arr[j];
     arr[j]=temp;
     return j;                              // now pivot is at its correct postion that is j. return that
    }







    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;                       //    low at index 0.
        int high=n-1;                   //     high at last index
        sort(arr,low,high);              // calling a func to sort an array

        for(int i=0;i<n;i++){                     // printing that sorted arrray.
            System.out.print(arr[i]+" ");
        }
    }
}
