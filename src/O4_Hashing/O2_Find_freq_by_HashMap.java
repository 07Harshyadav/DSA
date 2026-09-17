package O4_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class O2_Find_freq_by_HashMap {

    static void Hashing(int[]arr,int size){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);  // * important . (hashMap will not store same key twice .it update its value)
        }
        for(int x: map.keySet()){                          // map.keyset = keys deta h
            System.out.println(x +":"+ map.get(x));       // map.get = value deta h
        }
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];

        for(int i=0;i<size;i++){             // inputs for array
            arr[i]=sc.nextInt();
        }


        Hashing(arr,size);            // caliing a function


    }
}
