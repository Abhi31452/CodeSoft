import java.util.Scanner;

public class NumberGameTask {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int chances = 8;
        int finals = 0;
        boolean palynumberGame = true;
        System.out.println("WELCOME TO THE NUMBER GAME");
        System.out.println("HIIII you have about " + chances + "to ein the game");

        while (palynumberGame) {
            int random = getrandom(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println(" chances" + (i + 1) + " enter your guess");
                int user = s1.nextByte();
                if (user == random) {
                    guess = true;
                    finals = finals + 1;
                    System.out.println("you are Winner,");
                    break;
                } else if (user > random) {
                    System.out.println("Too high");

                } else {
                    System.out.println("too low");

                }

            }
            if (guess == false) {
                System.out.println("Sorry you LOST .The Number is" + random);

            }
            System.out.println("Do you wnat a game play again");
            String a = s1.next();
            palynumberGame = a.equalsIgnoreCase("y");
        }
        System.out.println("Hope You Enjoy");
        System.out.println("HERE IS YOUR SCORE" + finals);
    }
        public static int getrandom(int min,int max){
            return (int) (Math.random() * (max - min + 1) + min);
        }
    }

