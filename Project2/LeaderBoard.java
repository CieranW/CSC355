public class LeaderBoard {
    private Contestant[] contestants;


    public LeaderBoard(int size) {
        contestants = new Contestant[size];
    }

    public void add(Contestant contestant) {
        for (int i = 0; i < contestants.length; i++) {
            if (contestants[i] != null) {
                contestants[i] = contestant;
                break;
            }
        }
    }

    Contestant[] finalBoard() {
        int n = array.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing and swapping elements
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if needed (Descending order)
                if (array[j] < array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Mark swapped as true
                    swapped = true;
                }
            }

            // If no swaps were made, the array is already sorted
            if (!swapped) {
                break;
            }        for (int i = 0; i < contestants.length; i++) {
            for (int j = 0; j < contestants.length; j++) {
                if (contestants[j].contestantScore > contestants[i].contestantScore) {
                    Contestant temp = contestants[i];
                    contestants[i] = contestants[j];
                    contestants[j] = temp;
                }
            }
        }
        return contestants;
    }    
    }
}
