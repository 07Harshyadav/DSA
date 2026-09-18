package O5_Sorting;
import java.util.Scanner;

public class O4_Merge_sort {

    static void sort(int[]arr,int low,int high){
        int mid = (low+high)/2;                          // divide the array from middle.
        if(low>=high){                            // when low and high are at same element return.
            return;
        }
        sort(arr,low,mid);                        // call same func with first half of array.
        sort(arr,mid+1,high);                // call same func with second half of array.
        merge(arr,low,mid,high);                // call a merge func for merging elements in sorted way.
    }
    static void merge(int[]arr,int low,int mid,int high){
        int[] temp = new int[(high-low)+1];        // create temp array
        int index =0;
        int left =low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]>arr[right]){
                temp[index]=arr[right];
                right++;
                index++;
            }else{
                temp[index]=arr[left];
                left++;
                index++;
            }
        }
        while(left<=mid){
            temp[index]=arr[left];
            left++;
            index++;
        }
        while(right<=high){
            temp[index]=arr[right];
            right++;
            index++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];               // temp always started from zero.
        }
    }


// MAIN CONCEPT ---->  (divide-divide...-merge-merge....)



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int [size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int low=0;
        int high = size-1;
        sort(arr,low,high);                      // calling a function.
        for(int i=0;i<size;i++){                   // print after function executed
            System.out.print(arr[i]+" ");
        }
    }
}
