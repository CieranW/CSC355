public class ToRun {
    public static int findMinVal(int [] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static void sortArray(int [] arr) {
        int i;
        int j;
        int temp;
        int n = arr.length;

        for (i = 0; i < n; ++i) {
            for (j = i + 1; j < n; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(int [] numbers, int key) {
      int mid;
      int low;
      int high;

      low = 0;
      high = numbers.length - 1;

      while (high >= low) {
         mid = (high + low) / 2;
         if (numbers[mid] < key) {
            low = mid + 1;
         } 
         else if (numbers[mid] > key) {
            high = mid - 1;
         } 
         else {
            return mid;
         }
      }
      return -1; // not found
   }

   public static int linearSearch(int [] numbers, int key) {
      int i;

      for (i = 0; i < numbers.length; ++i) {
         if (numbers[i] == key) {
            return i;
         }
      }
      return -1; /* not found */
   }

   public static void PrintArray(int [] arr) {
      int i;
      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    public static void PrintKeyIndex(int key, int keyIndex) {
        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        } 
        else {
            System.out.println("Found " + key + " at index " + keyIndex + ".");
        }
    }

    public static void main(String[] args) {
        int [] arr1 = {100, 775, 146, 483, 789, 990, 844, 926, 89, 416, 540, 747, 398, 608, 356, 84, 315, 971, 834, 591, 447};
        int [] arr2 = {915, 550, 369, 666, 100, 435, 638, 342, 440, 780, 902, 901, 329, 115, 29, 361, 930, 505, 439, 75, 322};

        int key;
        int keyIndexLS, keyIndexBS;

        System.out.println("Array 1:");
        PrintArray(arr1);
        System.out.println("Array 2:");
        PrintArray(arr2);

        // Search for the minimum value in array 1 and array 2
        key = findMinVal(arr1);

        keyIndexLS = linearSearch(arr1, key);
        sortArray(arr1);
        keyIndexBS = binarySearch(arr1, key);

        PrintKeyIndex(key, keyIndexLS);
        PrintKeyIndex(key, keyIndexBS);

        key = findMinVal(arr2);

        keyIndexLS = linearSearch(arr2, key);
        sortArray(arr2);
        keyIndexBS = binarySearch(arr2, key);

        PrintKeyIndex(key, keyIndexLS);
        PrintKeyIndex(key, keyIndexBS);
    }
}
