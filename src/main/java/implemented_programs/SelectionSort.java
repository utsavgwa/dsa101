package implemented_programs;

public class SelectionSort {

    // print array function
    public static void printArray(int []arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // selection sort function, to sort array
    public static void selectionSort(int []arr) {
        int n= arr.length;

        // number of rounds for n elements, is n-1, for selection sort
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i; j<n; j++){
                if (arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            // to swap the i'th element with smallest element's index in array
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]= temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={6,53,68,9,8,5,71,25,85};
        selectionSort(arr);
        printArray(arr);
    }
}
