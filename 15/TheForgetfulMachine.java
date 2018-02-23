// Thurs Feb 22nd, 2018

import java.util.Scanner;

public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey there, bud. Wanna give me a word? Any word. ");
        input.next();
        
        System.out.print("That wasn't good enough. Give me a better word. ");
        input.next();
        
        System.out.print("You're horrible. Just tell me your favourite number. ");
        input.nextInt();
        
        System.out.print("Garbage. I think your least favourite number would be better than that. Now give it to me. ");
        input.nextInt();
        
        System.out.println("You're a complete waste of time and space. Take care, bud.");
    }
}
