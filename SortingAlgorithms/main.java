public class main {
    public static void main(String[] args) {
        int arr[] ={8, 1, 2, 9, 0, 3};

        System.out.println("Array before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int countBubble = 0;
        countBubble = BubbleSort.bubbleSort(arr, countBubble);

        int arr1[] ={8, 1, 2, 9, 0, 3};
        int countSelection = 0;
        countSelection = SelectionSort.selectionSort(arr1, countSelection);

        int arr2[] ={8, 1, 2, 9, 0, 3};
        int countInsertion = 0;
        countInsertion = Insertion.insertionSort(arr2, countInsertion);

        int arr3[] ={8, 1, 2, 9, 0, 3};
        int countShell = 0;
        countShell = ShellSort.shellSort(arr3, countShell);

        int arr4[] ={8, 1, 2, 9, 0, 3};
        int countQuick = 0;
        countQuick = Quicksort.quicksort(arr4, 0, arr.length - 1, countQuick);

        int arr5[] ={8, 1, 2, 9, 0, 3};
        int countMerge = 0;
        countMerge = Mergesort.mergeSort(arr5, 0, arr.length - 1, countMerge);

        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Number of iterations for Bubble Sort: " + countBubble);
        System.out.println("Number of iterations for Selection Sort: " + countSelection);
        System.out.println("Number of iterations for Insertion Sort: " + countInsertion);
        System.out.println("Number of iterations for Shell Sort: " + countShell);
        System.out.println("Number of iterations for Quick Sort: " + countQuick);
        System.out.println("Number of iterations for Merge Sort: " + countMerge);

    }
}
