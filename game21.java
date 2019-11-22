import java.util.Scanner;

public class game21{
  public static void main(String [] args){
    //create Scanner object to get input
    Scanner input = new Scanner(System.in);

    //Set number of stick to 21
    int numStick = 21;

    //Get whether the player wants to go first
    int numTake;
    System.out.print("Enter Y or y to go first, else go second: ");
    String first = input.nextLine();
    if(first.equals("Y") || first.equals("y")){
      //get user input if user go first
      System.out.print("Enter number of stick to take (1 or 2): ");
      numTake = input.nextInt();
      numStick -= numTake;
      System.out.println("There are " + numStick + " sticks left.");
    }

    //loop for user to take sticks until 1 or no stick left
    do{
      if((numStick - 2) % 3 == 0 || numStick == 2){
        numTake = 1;
      }
      else{
        numTake = 2;
      }
      numStick -= numTake;
      System.out.println("Computer takes " + numTake + " sticks.");
      System.out.println("There are " + numStick + " sticks left.");

      //check if the game ended
      if(numStick <= 1){
        System.out.println("You Lose!");
      }
      else{
        System.out.print("Enter number of stick to take (1 or 2): ");
        numTake = input.nextInt();
        numStick -= numTake;
        if(numStick <= 1){
          System.out.println("Congratulation! You won!");
        }
      }
    }while(numStick > 1);
    System.out.println();
    System.out.println("\t G A M E   O V E R ! ");
    System.out.println();
  }
}
