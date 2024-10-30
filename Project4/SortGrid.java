import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SortGrid {

    public static int[][] readGridFiles(File file) throws IOException {
        try (Scanner scanner = new Scanner(file)) {
            // Read the first integer as the number of rows and columns
            int size = scanner.nextInt();
            int[][] grid = new int[size][size];
            
            // Populate the 2D array with the rest of the values
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (scanner.hasNextInt()) {
                        grid[i][j] = scanner.nextInt();
                    } else {
                        throw new IOException("Insufficient data in the file for the specified grid size.");
                    }
                }
            }
            return grid;
        }
    }

    public static void sortGrid(int[][] grid) {
        int n = grid.length;

        // Bubble sort using virtual indices on the 2D array
        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                // Convert 1D index back to 2D indices
                int row1 = j / n, col1 = j % n;
                int row2 = (j + 1) / n, col2 = (j + 1) % n;

                // Compare and swap if needed
                if (grid[row1][col1] > grid[row2][col2]) {
                    int temp = grid[row1][col1];
                    grid[row1][col1] = grid[row2][col2];
                    grid[row2][col2] = temp;
                }
            }
        }
    }

    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        File folder = new File("/Users/cieranwong/Documents/GitHub/CSC355/Project4/GridFiles");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles == null || listOfFiles.length == 0) {
            System.out.println("The folder is empty or does not exist.");
            return;
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    int[][] grid = readGridFiles(file);

                    System.out.println("Original Grid from " + file.getName() + ":");
                    printGrid(grid);

                    sortGrid(grid);

                    System.out.println("\nSorted Grid:");
                    printGrid(grid);
                    System.out.println("\n");

                } catch (IOException e) {
                    System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}