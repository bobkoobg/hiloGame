package hilogame;

import java.util.Random;
import java.util.Scanner;

public class HiLoGame {

    public static void main( String[] args ) {
        System.out.println( "\nChoose a number between 1 and 100." );

        Scanner scan = new Scanner( System.in );
        int userInput = scan.nextInt();

        while ( userInput < 1 || userInput > 100 ) {
            System.out.println( "\nCome on, you can do it - Between 1 and 100" );
            userInput = scan.nextInt();
        }

        int count = 0, guess = 0;
        Random number = new Random();

        boolean isPlaying = true;
        
        while ( isPlaying ) {

            guess = number.nextInt( 100 ) + 1;
            count = count + 1;

            if ( guess == userInput ) {
                System.out.println( "The Computer chose " + guess + " which is CORRECT" );
                System.out.println( "\nThe Number which you chose was " + userInput );
                System.out.println( "The Computer needed " + count + " tries to beat you." );
                System.out.println( "\nDo you want to play again? \n\t1.Yes \n\t2.No" );
                userInput = scan.nextInt();
                if ( userInput == 1 ) {
                    main( args );
                } else {
                    isPlaying = false;
                }
            } else if ( guess != userInput ) {
                System.out.println( "#" + count + "| The Computer chose " + guess + " which is incorrect." );
            }
        }
    }
}
