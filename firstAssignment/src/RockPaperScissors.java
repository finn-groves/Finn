import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        //create a scanner
        Scanner scan = new Scanner(System.in);
        //create a new random number generator
        Random rand = new Random();
        //create a variable named 'choice' that holds an empty string
        String choice = "";
        //create a variable named 'comsChoice' that holds an empty string
        String comsChoice = "";
        //print a space
        System.out.println(choice);
        //print the rules of the game
        System.out.println("Choose rock, paper, or scissors, or 'x' to exit. You're playing to 5. Acceptable luck!");
        //set the user's score to 0
        int yourScore = 0;
        //set the coms score to 0
        int theirScore = 0;
        //if the user types 'x', quit the game
        if (choice.equals("x")){System.exit(0);}

        //create a loop that executes so long as the user does not enter 'x'
        while (!choice.equals("x")){
            //the 'choice' string variable is assigned whatever the user types and then enters
            choice = scan.nextLine();
            //the computer generates a random number between 0 and 2, and depending on what that
            //number is, the string variable 'comsChoice' is assigned a different value (either 'rock', 'paper', or 'scissors')
            int comsChoiceGenerator = rand.nextInt(3);
            if (comsChoiceGenerator == 0){comsChoice = "rock";}
            else if (comsChoiceGenerator == 1){comsChoice = "paper";}
            else if (comsChoiceGenerator == 2){comsChoice = "scissors";}

            //check to see if the users entry is valid
            if (choice.equals("rock")||choice.equals("paper")||choice.equals("scissors")||choice.equals("x")) {
                //print the value of the user's choice and the value of the computer's choice
                System.out.println("You chose: " + choice);
                System.out.println("Your opponent chose: " + comsChoice);
                //check to see if the user and the computer are tied, and if so, display this to the user
                if (choice.equals(comsChoice)) {
                    System.out.println("It's a tie!");
                }
                //if not, check to see if the value of the computers 'choice' beats the value of the users choice
                //if so, tell the user that they lost and increase the computer's score by a value of 1
                if ((choice.equals("rock") && comsChoice.equals("paper"))
                        || (choice.equals("paper") && comsChoice.equals("scissors"))
                        || (choice.equals("scissors") && comsChoice.equals("rock"))) {
                    System.out.println("You lost");
                    theirScore++;
                }
                //otherwise, check to see if the value of the user's choice beats the value of the computer's 'choice'
                //if so, tell the user that they won and increase the user's score by a value of 1
                else if ((choice.equals("paper") && comsChoice.equals("rock"))
                        || (choice.equals("rock") && comsChoice.equals("scissors"))
                        || (choice.equals("scissors") && comsChoice.equals("paper"))) {
                    System.out.println("You won!");
                    yourScore++;
                }
                //no matter what happens, display the user's score and the coputer's score
                System.out.println("The current score is: " + "You: " + yourScore + " | Your opponent: " + theirScore);
            }
            //if the user's entry was not valid, tell the user to please enter a valid entry
            else {
                System.out.println(choice + " isn't a valid entry. Please play by the rules of the schools!");
            }
            //if the user's score is greater than 4, tell them that they won the whole game, and then exit the game
            if (yourScore > 4){System.out.println("YOU WON THE WHOLE GAME!"); System.exit(0);}
            //if the computer's score is greater than 4, tell the user that they lost the whole game, and then exit the game
            else if (theirScore > 4){System.out.println("YOU LOST THE WHOLE GAME!");System.exit(0);}
        }
    }
}

//This assignment will require you to create a simple paper rock and scissors game. 
//Using the scanner tool from the videos to get user input.  Write a program that gathers user input and stores it
//in a variable. Then randomly select paper, rock or scissors for the computer.  Compare whether or not
//the player should win and print out the appropriate statement. Attached is a short video of what the output should look like.  
//
//Criteria:
//1. Comments must be used to explain how the program will work
//2. The computer's answer must be randomly generated
//3. No errors should occur
//4. When ever possible use variables.  (writing every string every time is inefficient)
//5. Handle an invalid selection from use
//6. Game should loop until user is done
//7. Keep track of the users wins and losses
//8. User friendly anyone who runs program should be able to play