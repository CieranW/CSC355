public class LeaderBoard {
    private Contestant[] contestants;

    // Constructor to initialize the contestant array
    public LeaderBoard(int size) {
        contestants = new Contestant[size];
    }

    // Method to add a contestant to the array
    public void add(Contestant contestant) {
        for (int i = 0; i < contestants.length; i++) {
            // Only add if the current spot is null
            if (contestants[i] == null) {
                contestants[i] = contestant;
                break;
            }
        }
    }

    // Sorting method using Contestant's compareTo method
    public Contestant[] finalBoard() {
        // Bubble sort using compareTo() from the Contestant class
        for (int i = 0; i < contestants.length - 1; i++) {
            for (int j = 0; j < contestants.length - 1 - i; j++) {
                if (contestants[j] != null && contestants[j + 1] != null) {
                    // Use compareTo method for comparison
                    if (contestants[j].compareTo(contestants[j + 1]) < 0) {
                        // Swap the contestants if they're out of order
                        Contestant temp = contestants[j];
                        contestants[j] = contestants[j + 1];
                        contestants[j + 1] = temp;
                    }
                }
            }
        }
        return contestants;
    }

    // Method to print the leaderboard
    public void printBoard() {
        for (Contestant contestant : contestants) {
            if (contestant != null) {
                System.out.println(contestant);
            }
        }
    }
}