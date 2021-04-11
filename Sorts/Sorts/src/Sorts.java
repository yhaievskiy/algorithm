import sorts.SelectionSort;
import sorts.QuickSort;

public class Sorts {
    static void printArray(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int findLargest(int[] arr, int n) {
        if(n == 1)
            return arr[0];
       return Math.max(arr[n - 1], findLargest(arr, n - 1));
    } 
    public static void main(String[] args) throws Exception {
        int[] test = {1, 2, 10, 5, 4, 11};
        SelectionSort.selectionSort(test);
        int[] test2 = {20, -10, 12, 5, 4, 11};
        QuickSort.quickSort(test2, 0, test2.length - 1);
        printArray(test2);
    }
}
