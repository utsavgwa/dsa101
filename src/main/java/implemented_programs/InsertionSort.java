package implemented_programs;

// at each iteration, take the element and insert/move it on its correct position
public class InsertionSort {
    public static void printArray(int []arr) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int []arr) {
        int n=arr.length;

        // loop for checking and inserting i'th element at sorted position
        for (int i = 0; i < n; i++) {
            int j=i-1;

            // taking temp so that element gets compared, not the element which is at i'th position
            int temp = arr[i];
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            // now, have come out of the loop, so temp will be placed at current position+1, i.e. j+1
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,6,9,8,7,2,1};
        insertionSort(arr);
        printArray(arr);
    }
}
