public class ArraySort {
    public static int insertionSort(int arr[], int count) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr[i] > key ) ) {
                arr[i+1] = arr[i];
                i--;
                count++;
            }
            arr[i+1] = key;
        }
        return count;
    }
}
