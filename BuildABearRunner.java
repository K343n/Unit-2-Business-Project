import java.util.Scanner;

public class BuildABearRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

CreateABear pinky = new CreateABear("Monkey", "Silk", 20.00, "Big Heart");
    System.out.println(pinky);

    /* ---- 🔎 ADD YOUR CODE BELOW THIS LINE ---- */
DressABear bluey = new DressABear("Bunny", "Fluffy", 25.00, true, "Surgeon");
System.out.println(bluey);




    // Closes the Scanner object
    input.close();
    
  }
}