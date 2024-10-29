public class LinearSearch{
   public static int linearSearch(int [] numbers, int key) {
      int i;

      for (i = 0; i < numbers.length; ++i) {
         if (numbers[i] == key) {
            return i;
         }
      }
      return -1; /* not found */
   }
}