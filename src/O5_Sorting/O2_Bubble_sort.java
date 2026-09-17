package O5_Sorting;

import java.util.Scanner;

public class O2_Bubble_sort {

    static void sort(int[]arr,int size){
                                                   // Push largest element to the last by adjacent swaps.
        for(int i=size-1;i>=1;i--){       // first element ko last tk lane m 4 swap lgenge. largest element i position p aa jayega.
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
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

