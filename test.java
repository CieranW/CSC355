import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Initialize input arrays
        List<Integer> InputArray1 = new ArrayList<>();
        List<Integer> InputArray2 = new ArrayList<>();
        List<Integer> OutputArray = new ArrayList<>();

        // Sample input arrays
        InputArray1.add(1);
        InputArray1.add(2);
        InputArray1.add(4);
        InputArray1.add(5);
        InputArray1.add(6);

        InputArray2.add(4);
        InputArray2.add(4);
        InputArray2.add(6);
        InputArray2.add(8);
        InputArray2.add(8);
        InputArray2.add(12);
        InputArray2.add(15);

        // Pointers for both arrays
        int i = 0, j = 0;

        // Merge the two sorted arrays
        while (i < InputArray1.size() && j < InputArray2.size()) {
            if (InputArray1.get(i) <= InputArray2.get(j)) {
                OutputArray.add(InputArray1.get(i));
                i++;
            } else {
                OutputArray.add(InputArray2.get(j));
                j++;
            }
        }

        // Add remaining elements from InputArray1 if any
        while (i < InputArray1.size()) {
            OutputArray.add(InputArray1.get(i));
            i++;
        }

        // Add remaining elements from InputArray2 if any
        while (j < InputArray2.size()) {
            OutputArray.add(InputArray2.get(j));
            j++;
        }

        // Output the merged array
        for (int val : OutputArray) {
            System.out.println(val);
        }
    }
}