public class Mergesort {
   public static void merge(int [] numbers, int i, int j, int k, int count) {
      int mergedSize = k - i + 1;       // Size of merged partition
      int mergedNumbers [] = new int[mergedSize]; // Temporary array for merged numbers
      int mergePos;                     // Position to insert merged number
      int leftPos;                      // Position of elements in left partition
      int rightPos;                     // Position of elements in right partition

      mergePos = 0;
      leftPos = i;                      // Initialize left partition position
      rightPos = j + 1;                 // Initialize right partition position

      // Add smallest element from left or right partition to merged numbers
      while (leftPos <= j && rightPos <= k) {
         if (numbers[leftPos] < numbers[rightPos]) {
            mergedNumbers[mergePos] = numbers[leftPos];
            ++leftPos;
         } 
         else {
            mergedNumbers[mergePos] = numbers[rightPos];
            ++rightPos;
         }
         ++mergePos;
         count++;
         printArray(numbers); // Print array after each swap
      }

      // If left partition is not empty, add remaining elements to merged numbers
      while (leftPos <= j) {
         mergedNumbers[mergePos] = numbers[leftPos];
         ++leftPos;
         ++mergePos;
         count++;
         printArray(numbers); // Print array after each swap
      }

      // If right partition is not empty, add remaining elements to merged numbers
      while (rightPos <= k) {
         mergedNumbers[mergePos] = numbers[rightPos];
         ++rightPos;
         ++mergePos;
         count++;
         printArray(numbers); // Print array after each swap
      }

      // Copy merge number back to numbers
      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
         numbers[i + mergePos] = mergedNumbers[mergePos];
      }
   }

   public static int mergeSort(int [] numbers, int i, int k, int count) {
      int j;

      if (i < k) {
         j = (i + k) / 2;  // Find the midpoint in the partition
         count++;
         // Recursively sort left and right partitions
         mergeSort(numbers, i, j, count);
         mergeSort(numbers, j + 1, k, count);

         // Merge left and right partition in sorted order
         merge(numbers, i, j, k, count);
      }
      return count;
   }

   public static void printArray(int[] numbers) {
      for (int num : numbers) {
         System.out.print(num + " ");
      }
      System.out.println();
   }

   public static void main(String [] args) {
      int [] numbers = {3, 0, 4, 1, 5, 2, 9, 7, 8, 6};
      int i;
      int count = 0;

      System.out.print("UNSORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* initial call to merge sort with index */
      count = mergeSort(numbers, 0, numbers.length - 1, count);

      System.out.print("SORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      System.out.println("Number of iterations: " + count);
   }
}