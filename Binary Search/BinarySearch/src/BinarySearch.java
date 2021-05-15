public class BinarySearch {
    static int binarySearchIterative(int array[], int searchItem){
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int guess = array[mid];
            if(guess == searchItem) 
                return mid;
            if(guess < searchItem) 
                start = mid + 1;
            else
                end = mid - 1; 
            
        }
        return -1;
    }

    static int binarySearchRecursive(int arr[], int start, int end, int searchElement)
    {
        if (end >= start) {
            int mid = start + (end - start) / 2;
  
            if (arr[mid] == searchElement)
                return mid;
  
            if (arr[mid] > searchElement)
                return binarySearchRecursive(arr, start, mid - 1, searchElement);
  
            return binarySearchRecursive(arr, mid + 1, end, searchElement);
        }
  
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] a = {1, 4, 8, 10, 25};
        System.out.println(binarySearchRecursive(a, 0, a.length - 1, 8));
    }
}
