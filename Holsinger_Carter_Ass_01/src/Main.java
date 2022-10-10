import java.util.Scanner;
import static java.lang.System.in;
public class Main
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(in);
            System.out.println("Player 1: Choose rock, scissors, or paper:");
            String player1 = scan.next().toLowerCase();
            System.out.println("Player 2: Choose rock, scissors, or paper:");
            String player2 = scan.next().toLowerCase();
            boolean done = true;
            do {
                if (player1.equals(player2)) {
                    System.out.print("It is a tie");
                } else if (player1.equals("P") && player2.equals("R")) {
                    System.out.println("Player one wins");
                } else if (player1.equals("S") && player2.equals("R")) {
                    System.out.println("Player two wins");
                } else if (player1.equals("R") && player2.equals("P")) {
                    System.out.println("Player two wins");
                } else if (player1.equals("R") && player2.equals("S")) {
                    System.out.println("Player one wins");
                }
                done = false;
            } while(done);
        }
}





