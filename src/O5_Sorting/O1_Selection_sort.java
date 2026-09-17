package O5_Sorting;
import java.util.Scanner;

public class O1_Selection_sort {

    static void sort(int[]arr,int size){

        for(int i=0;i<size-1;i++){                  // we dont need to run i to last index.Because at second last postion swap to last postion if last is small.
            int min = i;                          // now min index is i.On increase i min index is also increase
            for(int j=i+1;j<size;j++) {            // run j from i+1.
                if (arr[j] <arr[min]) {
                    min = j;                      // if any element is small than min(i). then min index is that
                }
            }
            int temp = arr[i];                   // swap with smaller elemnt
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int [size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }


        sort(arr,size);                      // calling a function.
        for(int i=0;i<size;i++){                   // print after function executed
            System.out.print(arr[i]+" ");
        }
    }
}
