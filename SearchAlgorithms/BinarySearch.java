public class BinarySearch{
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
}