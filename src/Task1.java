
/*
Sheetal Verma
Task 1
CodSoft
*/
import java.util.Random;
import java.util.*;
public class Task1 {
    public static void main(String arg[])
    {
        System.out.println("\n \n                  ***    WELCOME TO NUMBER GUSSING GAME    ***");
        //create instance of Random class
        Random rand = new Random();
        //Importing scanner class for taking input from the user
        Scanner sc=new Scanner(System.in);
        int chances=5;
        boolean playagain=true;


        while(playagain) {
            int randomnumber = rand.nextInt(1, 100);
            System.out.println(randomnumber);
            System.out.println("Enter number between 1 to 100 ");
            for (int round = 1; round <= 5; round++) {

                System.out.println("\n------ > This is Round: " + round);

                System.out.print("Enter your guess for the generated number : ");
                int userguess = sc.nextInt();

                if (userguess == randomnumber) {
                    System.out.println("\n        * * *Congratulations your guess is correct!!!YOU WIN THE GAME!!!! * * *        ");
                    System.out.println("You won at " + round + " attempt");
                    playagain=false;
                    break;

                } else {
                    System.out.println((randomnumber > userguess) ? "Your guess is too low" : "Your guess is too high");

                }
                chances = chances - 1;
                if (chances == 0) {
                    System.out.println("Sorry Your Attempts Are Over");
                    System.out.println("\n               * * *  YOU LOSES THE GAME  * * *             ");
                    playagain=false;

                }

            }

            System.out.println("Do you wants to play again type YES or NO");
            String play = sc.next();
            if (play.equalsIgnoreCase("YES")) {
                playagain = true;
            }
            else {
                System.out.println("OKAY THANK YOU ");
            }
        }
    }
}







