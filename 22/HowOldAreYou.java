import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        // boolean toggle = false;
        
        /*if (toggle == true) {
            System.out.print(System.lineSeparator()); MAINTENANCE stage i guess
        } */
        
        if (0 < age & age < 20) {
            // toggle = true;
            System.out.print(System.lineSeparator()); // for now i have to copy and past this line separator a couple of times and i dont want to. ill be bach.
            System.out.println("You can't rent a car.");
            if (age < 18) {
                System.out.println("You can't vote.");
                if (age < 16) {
                    System.out.println("lol, you can't even drive. loosoer."); // this is so ugly. has to be a better way and its prob obvious
                } // my goal is to do it in a way so that I don't have to type out "ohoho can't rent a car" like every if statement but putting if statements into other if statements is so sroigjasigross
            }
        } else if (age <= 0) {
            // toggle = true;
            System.out.print(System.lineSeparator());
            System.out.println("what the crunch");
        } else {
            // toggle = true;
            System.out.print(System.lineSeparator());
            System.out.println("You're not welcome here.");
        }
    }
}
