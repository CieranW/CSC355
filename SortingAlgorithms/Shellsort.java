// Java implementation of ShellSort
public class ShellSort
{
	/* An utility function to print array of size n*/
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/* function to sort arr using shellSort */
	public static int shellSort(int arr[], int count)
	{
		int n = arr.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n/2; gap > 0; gap /= 2)
		{
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1)
			{
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];
					count++;

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
			}
		}
		return count;
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = {8, 1, 2, 9, 0, 3};
		int count = 0;
		System.out.println("Array before sorting");
		printArray(arr);

		count = shellSort(arr, count);

		System.out.println("Array after sorting");
		printArray(arr);
		System.out.println("Number of iterations: " + count);
	}
}