package hilogame;

import java.util.Random;
import java.util.Scanner;

public class HiLoGameExtended {

    public static void main( String[] args ) {

        Random number = new Random();
        Scanner scanner = new Scanner( System.in );
        int triesCounter = 0;

        System.out.println( "Hello Player, \nI would like to play a game!"
                + "\n\tChoose 1 to be the Guesser\n\tChoose 2 to be the NumberSelector" );

        int userInput = scanner.nextInt();
        if ( userInput == 1 ) {

            int secretNumber = number.nextInt( (100) + 1 );

            System.out.println( "\nYou should try to guess what's the number (between 1 and 100)." );

            while ( true ) {
                int playerChoice = scanner.nextInt();
                triesCounter = triesCounter + 1;
                if ( playerChoice < secretNumber ) {

                    System.out.println( "This was your " + triesCounter + " try, you chose " + playerChoice );
                    System.out.println( "\tGO HIGHER !!!!!" );
                } else if ( playerChoice > secretNumber ) {

                    System.out.println( "This was your " + triesCounter + " try, you chose " + playerChoice );
                    System.out.println( "\tGO LOWER !!!!!" );
                } else if ( playerChoice == secretNumber ) {

                    System.out.println( "This was your " + triesCounter + " try, you chose " + playerChoice );
                    System.out.println( "\nYou did it, good game!" );
                    break;
                }
            }
            System.out.println( "\nYou were able to beat the game after " + triesCounter + " tries."
                    + "\nDo you want to play again? "
                    + "\n\t1.Yes "
                    + "\n\tAny number for 'No'" );

            userInput = scanner.nextInt();
            if ( userInput == 1 ) {
                main( args );
            }

        } else if ( userInput == 2 ) {
            System.out.println( "\nChoose a number between 1 and 100" );

            int playerSecret = scanner.nextInt();

            while ( userInput < 1 || userInput > 100 ) {
                System.out.println( "\nCome on, you can do it - Between 1 and 100" );
                playerSecret = scanner.nextInt();
            }

            while ( true ) {
                int computerGuess = number.nextInt( 100 ) + 1;

                triesCounter = triesCounter + 1;

                if ( computerGuess == playerSecret ) {

                    System.out.println( "#" + triesCounter + "| The Computer chose " + computerGuess + " which is CORRECT" );
                    System.out.println( "\nThe Number which you chose at 1st place was " + playerSecret + ","
                            + "\n The Computer found your number from the " + triesCounter + " try." );
                    System.out.println( "\nDo you want to play again? \n\t1.Yes \n\tAny number for 'No'" );
                    playerSecret = scanner.nextInt();

                    if ( playerSecret == 1 ) {
                        main( args );
                    } else {
                        System.out.println( "\nThank you for the game" );
                        return;
                    }
                } else if ( computerGuess != playerSecret ) {
                    System.out.println( "#" + triesCounter + "| The Computer chose " + computerGuess + " which is incorrect." );
                }
            }
        } else {
            System.out.println( "\n\tWrong number" );
            main( args );
        }
    }
}
