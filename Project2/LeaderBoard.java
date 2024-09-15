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
        for (int i = 0; i < contestants.length; i++) {
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
