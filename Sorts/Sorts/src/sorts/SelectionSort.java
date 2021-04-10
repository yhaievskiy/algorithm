package sorts;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[min]){  
                    min = j; 
                }  
            }  
            int smallerNumber = arr[min];   
            arr[min] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
}
