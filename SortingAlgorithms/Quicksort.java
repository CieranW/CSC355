public class Quicksort {
   public static int partition(int [] numbers, int i, int k, int count) {
      int l;
      int h;
      int midpoint;
      int pivot;
      int temp;
      boolean done;

      /* Pick middle element as pivot */
      midpoint = i + (k - i) / 2;
      pivot = numbers[midpoint];

      done = false;
      l = i;
      h = k;

      while (!done) {
         /* Increment l while numbers[l] < pivot */
         while (numbers[l] < pivot) {
            ++l;
            count++;
         }

         /* Decrement h while pivot < numbers[h] */
         while (pivot < numbers[h]) {
            --h;
            count++;
         }

         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
         if (l >= h) {
            done = true;
         } 
         else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
            temp = numbers[l];
            numbers[l] = numbers[h];
            numbers[h] = temp;

            ++l;
            --h;
            count++;
         }
      }

      return h;
   }

   public static int quicksort(int [] numbers, int i, int k, int count) {
      int j;

      /* Base case: If there are 1 or zero entries to sort,
       partition is already sorted */
      if (i >= k) {
         return count;
      }

      /* Partition the data within the array. Value j returned
         from partitioning is location of last item in low partition. */
      j = partition(numbers, i, k, count);
      count++;

      /* Recursively sort low partition (i to j) and
         high partition (j + 1 to k) */
      quicksort(numbers, i, j, count);
      quicksort(numbers, j + 1, k, count);

      return count;
   }

   public static void main(String [] args) {
      int [] numbers = {8, 1, 2, 9, 0, 3};
      int i;
      int count = 0;

      System.out.print("UNSORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* Initial call to quicksort */
      count = quicksort(numbers, 0, numbers.length - 1, count);

      System.out.print("SORTED: ");
      for (i = 0; i < numbers.length; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }
}