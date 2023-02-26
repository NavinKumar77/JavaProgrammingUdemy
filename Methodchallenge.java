public class MainChallenge {
    public static void main(String[] args) {
        int highscoreposition = calculatehighscoreposition(1500);
        displayhighscoreposition("Tim",highscoreposition);
        highscoreposition = calculatehighscoreposition(1000);
        displayhighscoreposition("bob",highscoreposition);
        highscoreposition = calculatehighscoreposition(500);
        displayhighscoreposition("kim",highscoreposition);
        highscoreposition = calculatehighscoreposition(100);
        displayhighscoreposition("john",highscoreposition);
        highscoreposition = calculatehighscoreposition(25);
        displayhighscoreposition("harry",highscoreposition);


    }

        public static void displayhighscoreposition(String playername,int highscoreposition){
        System.out.println(playername + " managed to get into the position " +
                highscoreposition + " on the high score list");
        }
        public static int calculatehighscoreposition(int playerscore){
        if(playerscore >= 1000){
            return 1;
        }
        else if(playerscore >= 500 && playerscore < 1000){
            return 2;
        }
        else if(playerscore >= 100 && playerscore < 500){
            return 3;
        }
        else{
            return 4;
        }

        }
    }
