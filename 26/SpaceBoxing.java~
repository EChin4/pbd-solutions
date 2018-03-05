import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double result = 0;
        double venus, mars, jupiter, saturn, uranus, neptune;
        venus = 0.78;
        mars = 0.39;
        jupiter = 2.65;
        saturn = 1.17;
        uranus = 1.05;
        neptune = 1.23;
        
        System.out.println();
        System.out.print("Please enter your current earth weight: ");
        double weight = input.nextDouble();
        
        System.out.println();
        System.out.println("I have some info on the following planets:");
        System.out.println("        1. Venus    2. Mars    3. Jupiter");
        System.out.println("        4. Saturn   5. Uranus  6. Neptune");   
        System.out.println();
        
        System.out.print("Which planet are you visting? (enter the planet #): ");
        double planetNum = input.nextDouble();
        
        if (planetNum == 1) {
            result = weight * venus;
        } else if (planetNum == 2) {
            result = weight * mars;
        } else if (planetNum == 3) {
            result = weight * jupiter;
        } else if (planetNum == 4) {    
            result = weight * saturn;
        } else if (planetNum == 5) {
            result = weight * uranus;
        } else if (planetNum == 6) {
            result = weight * neptune;
        }
        
        System.out.println();
        System.out.println("Your weight would be " + result + " pounds on that planet. u r welcome");
        System.out.println();
    }
}
