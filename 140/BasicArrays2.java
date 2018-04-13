// Fri Apr 13th, 2018 lUcKY
// https://www.thoughtco.com/how-to-generate-random-numbers-2034206

import java.util.Random; 

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] nmbrs = new int[10];
        Random rand = new Random();
        int pickedNmbr = rand.nextInt(90) + 1;
        
        for (int i = 0; i < nmbrs.length; i++) {
            nmbrs[i] = pickedNmbr;
            pickedNmbr = rand.nextInt(90) + 1;
            System.out.println("\n Slot " + i + " contains " + nmbrs[i] + "\n");        
        }
    }
}
