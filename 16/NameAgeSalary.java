// Thurs Feb 22nd, 2018

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey there, BOI. I haven't seen you around these parts before. What's your name? ");
        String userName = input.next();
        
        System.out.print("Looking good, " + userName + ". Just how old are you, friend? ");
        int userAge = input.nextInt();
        
        System.out.println("...So you're " + userAge + ", huh? Wow, you did not age all that well.");
        System.out.print("How much MOOLA do you make, " + userName + "? Annually. ");
        double userSalary = input.nextDouble(); // woaw inputting commas won't screw it up!
        
        System.out.println("$" + userSalary + " per year? Peasant money. Sorry, " + userName + ", I think I've seen enough."); 
    }
}
