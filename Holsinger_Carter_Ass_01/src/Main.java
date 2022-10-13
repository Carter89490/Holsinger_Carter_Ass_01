import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        boolean done = true;
        while (done) {
        Scanner scan = new Scanner(in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase();



                if (player1.equals(player2)) {
                    System.out.print("It is a tie");
                } else if (player1.equals("p") && player2.equals("r")) {
                    System.out.println("Player one wins");
                } else if (player1.equals("s") && player2.equals("r")) {
                    System.out.println("Player two wins");
                } else if (player1.equals("r") && player2.equals("p")) {
                    System.out.println("Player two wins");
                } else if (player1.equals("r") && player2.equals("s")) {
                    System.out.println("Player one wins");
                }
                System.out.println("do you wish to play again Ture, False: ");
                if (scan.hasNext()) {
                   done = scan.nextBoolean();
                }
            }
        }
    }






