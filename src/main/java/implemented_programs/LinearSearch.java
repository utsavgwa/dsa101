package implemented_programs;

import java.util.Scanner;

public class LinearSearch {
    // search function implemented here
    static int search(int[] arr, int n, int x){
        for (int i=0; i<n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    // main program
    public static void main(String[]args){
        int c, n, x, arr[];
        // made a new
        Scanner in = new Scanner(System.in);
        // asking array size from user and creating it
        n=in.nextInt();
        arr = new int[n];
        // inserting elements in array, from user
        for (c=0; c<n;c++){
            arr[c]=in.nextInt();
        }
        // taking element to find in array input from user
        x = in.nextInt();
        // calling search function
        System.out.println(search(arr, n, x));
    }
}

