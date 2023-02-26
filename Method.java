public class MainChallenge {
    public static void main(String[] args) {

        calculatescore(true,800,5,100);

        calculatescore(true,10000,8,200);

    }

    public static void calculatescore(boolean gameover, int score,int level,int bonus){

        int finalscore = score;
        if (gameover) {
            finalscore += (level * bonus);
            finalscore += 1000;
            System.out.println("Your Score is " + finalscore);
        }
    }
    }
