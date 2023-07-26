package implemented_programs;

public class BinarySearch {
    // binary search function
    public static int binarySearch(int []arr, int x){
        // declared 2 points as start and end
        int s=0, e=arr.length-1;

        while (s<=e){
            // declared the value of a mid, between start and end
            int m = (s+e)/2;
            // condition 1, look on left side of mid
            if (arr[m]>x){
                e=m-1;
            // condition 2, look on right side of mid
            } else if (arr[m]<x) {
                s=m+1;
            // condition 3, element at mid index is equal to x, searching element
            }else {
                return m;
            }
        }
        // if all the conditions don't work in while(s<=e), returning -1
        return -1;
    }
    // main function
    public static void main(String[] args) {
        //declared an array
        int arr[]={1, 4, 7, 10, 20, 35, 40};
        // calling binarySearch function & printing output given by it
        System.out.println(binarySearch(arr, 1));
    }

}
