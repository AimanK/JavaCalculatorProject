import java.util.Scanner; // Scanner class imported

class Main {
public static void main(String[] args) {
    int x; // First operand
    int y; // Second operand
    int result; // Store the result of the operations in here
    char operator; // + , - , * , or /
    boolean game = true; // Keeps track of the game loop



    Scanner scan = new Scanner(System.in); // Takes input from the user through Scanner class

    Calculator calc = new Calculator(); // Creates a calculator class object named 'calc'




    System.out.println("Welcome to Java Calculator!");

    
    // Initiates a game loop
    while (game != false)
    {

    // Grabs the operator needed from the user (this line is only used to grab a char datatype)
    operator = scan.next().charAt(0); 

    switch (operator)
    {
      // User would like to add
      case '+':

      /*
        Implementation goes here
      */

      break;

      // User would like to Subtract
      case '-':

      /*
        Implementation goes here
      */

      break;

      // User would like to multiply
      case '*':

      /*
        Implementation goes here
      */

      break;

      // User would like to divide
      case '/':

      /*
         Implementation goes here
      */

      break;

      default:
      System.out.println("Error! Wrong symbol (char) entered");
    }

    /*
      This code below is the magic of the game loop, it allows a user to continue playing the game over and over until they get tired on only one run.
    */
    System.out.println("Would you like to calculate something else? If yes, enter 1: ");

    System.out.println("Otherwise, enter any other number");

     int check = scan.nextInt();

     if (check == 1)
     {
       game = true;
     }    
     else
     {
       System.out.println("Goodbye...");
       game = false;
     }

    }
  }
}
