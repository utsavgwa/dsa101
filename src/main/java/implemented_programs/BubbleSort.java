package implemented_programs;

public class BubbleSort {
    public static void print(int []arr) {
        int p=arr.length;
        for (int i=0; i<p; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int []arr) {
        int n= arr.length;
        // for n-1 rounds
        for (int i = 0; i < n-1; i++) {

            // after every round, largest element is at last getting fixed, no comparison needed
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,3,6,8,1,5,7};
        bubbleSort(arr);
        print(arr);
    }
}
