public class MainChallenge {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int level = 5;
        int bonus = 100;
        int finalscore = score;
        if (gameover) {
            finalscore += (level * bonus);
            finalscore += 1000;
            System.out.println("Your Score is " + finalscore);
        }
//        boolean gameover1 = true;
//        int score1 = 10000;
//        int level1 = 8;
//        int bonus1 = 200;
//        int finalscore1 = score1;
//        if(gameover1 == true){
//            finalscore1 += (level * bonus1 );
//            System.out.println("Your Score is " + finalscore1);
//        }


         score = 10000;
         level= 8;
         bonus = 200;
         finalscore = score;
        if(gameover){
            finalscore += (level * bonus );
            System.out.println("Your Score is " + finalscore);
            }

    }
    }
