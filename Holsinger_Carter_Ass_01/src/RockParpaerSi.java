import java.util.Scanner;
public class RockParpaerSi
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase();
        boolean done = false;
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
        } while(!done);
    }
}

