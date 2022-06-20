import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    
      System.out.print("Let's play Rolling Java. Type anything to start.");
      scan.nextLine();
      
      System.out.println("\nGreat, here are the rules:");
      System.out.println("\t- If you roll a 6 the game stops.");
      System.out.println("\t- If you roll a 4 nothing happens.");
      System.out.println("\t- Otherwise, you get 1 point.\n");
      System.out.print("You must collect at least 3 points to win. Enter anything to roll: ");

      int score = 0;

      while (true) {
        scan.nextLine();
        int diceRoll = rollDice();
        System.out.println("\nYou rolled a " + diceRoll);
        if (diceRoll == 6) {
          System.out.println("End of game.\n");
          break;
        } else if (diceRoll == 4) {
          System.out.println("Zero points. Keep rolling.");
          continue;
        } else {
          score += 1;
          System.out.println("One point. Keep rolling.");
        }
      } 
      System.out.println("Your score is: " + score); 

      if (score >= 3) {
        System.out.println("Wow, that's lucky. You win!");
      } else {
        System.out.println("Tough luck, you lose :(");
      }
      scan.close();
    }
    
    public static int rollDice() {
      double randomNumber = Math.random() * 6;
      randomNumber ++;
      return (int)randomNumber;
    }
}
