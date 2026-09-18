package O5_Sorting;
import java.util.Scanner;

public class O3_Insertion_sort {

    static void sort(int[]arr,int size){
        for(int i=0;i<size;i++){
           int j=i;                            // when j=0 , then while loop is not executed.
            while(j>0 && arr[j-1]>arr[j]){        // if privious element is greater than present element .swap it until previous element is not greater.
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                    j--;
            }
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
