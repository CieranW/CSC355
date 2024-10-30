import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSorting {
    public static int[] readArrayFile(File file) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int countSS = 0;
        int countIS = 0;
        File folder = new File("/Users/cieranwong/Documents/GitHub/CSC355/Project4/ArrayFiles");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The folder is empty or does not exist.");
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {  // Ensure we're working with files only
                try {
                    int[] arr = readArrayFile(file);
                    int[] arr1 = arr.clone();
                    countSS = ShellSort.shellSort(arr, countSS);           // Assuming ShellSort class has shellSort method
                    countIS = ArraySort.insertionSort(arr1, countIS);      // Assuming ArraySort class has insertionSort method

                    // Display results for testing
                    System.out.println("File: " + file.getName());
                    System.out.println("Shell Sort: " + countSS + " iterations");
                    System.out.println("Insertion Sort: " + countIS + " iterations");
                    System.out.println();

                    // Reset counts for next file
                    countSS = 0;
                    countIS = 0;

                } catch (IOException e) {
                    System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}