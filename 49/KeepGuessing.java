// Thurs March 22nd, 2018
// this is so much fun
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int code = 9;
        int errorCount = 0;
        int triesLeft = 10; // could assign value of 9 instead
        
        System.out.println("\nI M THINK OF AN INT BETW (N INCLUDING) 0 N 10");
        System.out.print("NTER UR GUESS: ");
        int entry = input.nextInt();
        
        while (entry != code && triesLeft != 1) { // since i put the triesLeft -= 1 at the start of the loop, the condition has to be triesLeft != 1 and not triesLeft != 0. It'll be too late by then :?(
            triesLeft -= 1; // it might be better to put this at the end of the loop and just initially assign triesLeft a value of 9 instead of 10
            
            // make user feel bad
            if (entry >= 0 && entry <= 10) {
                System.out.println("\nYa no U R WRONG");
            } else {
                System.out.println("\n" + entry + "...? Between 0 and 10????");
                System.out.println("Can you READ?");
                System.out.println("CAN YOU COUNT?");
            }
            
            if (triesLeft == 1) {
                System.out.println("YOU HAVE " + triesLeft + " TRY LEFT.");
            } else {
                System.out.println("You have " + triesLeft + " tries remaining."); 
            }
            
            System.out.print("TRY AGN: ");  
            
            entry = input.nextInt();
        }
        
        if (entry == code) {
            System.out.println("\nok");
        } else {
            System.out.println("\ngrubbage");
        }
    }
}
