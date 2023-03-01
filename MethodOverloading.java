public class Main {
    public static void main(String[] args) {
        int newscore = CalculateScore("Tim",500);
        System.out.println("New Score is " + newscore);
        CalculateScore(75);
        CalculateScore();
    }
    public static int CalculateScore(String PlayerName,int score) {
        System.out.println("Player " + PlayerName + " Scored " + score + " Points");
        return score * 1000;
    }
    public static int CalculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " Points");
        return score * 1000;
    }
    public static int CalculateScore() {
        System.out.println("No player name,no player score");
        return 0;
    }

}
