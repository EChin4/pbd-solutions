// Tues March 20th, 2018 && Wed March 21st, 2018
// IN PROGRESS? i think it's good now actually. kinda
// turns out \n could skip lines. I think it's the most efficient/fastest way?
import java.util.Scanner;

public class EnterYourPIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pin = 911;
        int errorCount = 0;
        
        System.out.println("\nOollo. Welcome to my bank.");
        System.out.println("Enter your PIN below, please:");
        int entry = input.nextInt();
        
        while (entry != pin && errorCount >= 0 && errorCount < 4) {
            errorCount += 1;
            
            if (errorCount == 1) {
                System.out.println("\nummMMM");
                System.out.println("I don't THINK so.");
                System.out.println("Try again:");
            } else if (errorCount == 2) {
                System.out.println("\n... again?");
                System.out.println("You wanna try getting it right this time?");
            } else if (errorCount == 3) {
                System.out.println("\nOk, you're kind of pushin it here.");
                System.out.println("C'mon, let's go. Third time's the charm:");
            } else if (errorCount == 4) {
                System.out.println("\nWe can always take this outside, buddy.");
                System.out.println("THIS IS YOUR LAST CHANCE:"); 
            }
            
            entry = input.nextInt();
        } 
        
        // Version #1:
        
        if (entry == pin) {
            if (errorCount == 0) {
                System.out.println("\nALRIGHT! You now have access to your bank account!! call me");
            } else if (errorCount == 1) {
                System.out.println("\nTry to get it right the first time, alrighty?");
            } else if (errorCount == 2) {
                System.out.println("\nDam. It took you 2 frikkin tries.");
            } else if (errorCount == 3) {
                System.out.println("\nThird time's always the charm ;)");
            } else if (errorCount == 4) {
                System.out.println("\n...Correct");
                System.out.println("Consider yourself lucky, bub");
            } 
        } else {
            System.out.println("\nim gonno egg ur house");
        }
        
        // Version #2: (all done in one if statement vs. Version #1's if statement in an if statement. It's really only errorCount 4 that needs to be checked if it has the correct PIN)
        // It should work the same
        
        /*if (errorCount == 0) {
            System.out.println("\nALRIGHT! You now have access to your bank account!! call me");
        } else if (errorCount == 1) {
            System.out.println("\nTry to get it right the first time, alrighty?");
        } else if (errorCount == 2) {
            System.out.println("\nDam. It took you 2 frikkin tries.");
        } else if (errorCount == 3) {
            System.out.println("\nThird time's always the charm ;)");
        } else if (errorCount == 4 && entry == pin) {
            System.out.println("\n...Correct");
            System.out.println("Consider yourself lucky, bub");
        } else {
            System.out.println("\nim gonno egg ur house");
        } */
    }
}
