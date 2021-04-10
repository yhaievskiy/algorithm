import sorts.SelectionSort;

public class Sorts {
    static void printArray(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) throws Exception {
        int[] test = {1, 0, -10, 56, 3};
        SelectionSort.selectionSort(test);
        printArray(test);
    }
}
