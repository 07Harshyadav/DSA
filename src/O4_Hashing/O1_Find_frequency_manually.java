package O4_Hashing;

import java.util.Scanner;

public class O1_Find_frequency_manually {

    static int Hashing(int[]arr,int size,int dig){

        int[] hash = new int[5];              // [0,0,0,0,0]  . size = largest element in arr +1.

        for(int i=0;i<size;i++){
            hash[arr[i]]++;                 // every time same element found .at there postion, 0 will increase
        }
            return hash[dig];               // return freqeuncy of dig
    }




    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int dig = sc.nextInt();            // dig = element whose frequency to find.


        System.out.println( Hashing(arr,size,dig));         // Calling -> Printing
    }
}
