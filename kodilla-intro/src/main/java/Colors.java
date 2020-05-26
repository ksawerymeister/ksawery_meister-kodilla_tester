import java.util.Scanner;

public class Colors {

    public static String userSelectsColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter one letter: ");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "W":
                    return "White";
                case "R":
                    return "Red";
                case "Y":
                    return "Yellow";
                case "P":
                    return "Purple";
                case "B":
                    return "Black";
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
}
