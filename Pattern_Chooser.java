import java.util.Scanner;

class Invalid {
    public void Inv(String[] args) {
        System.out.println("Invalid Input");
        return;
    }
}

public class Pattern_Chooser {

    static void Square() {
        System.out.println("You have printed a Square!");
        System.out.println("");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle() {
        System.out.println("You have printed a Triangle!");
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Rectangle() {
        System.out.println("You have printed a Rectangle!");
        System.out.println("");

        for (int i = 0; i <= 4; i++) { // first line of using a for loop is the row
            for (int j = 0; j <= 10; j++) { // second line of using a for loop is the column
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Diamond() {
        System.out.println("You have printed a Diamond!");
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invalid Classinvalid = new Invalid();
        boolean continueloop = true;

        System.out.println("Choose a pattern to print");
        System.out.println("");
        System.out.println("[1] For Square");
        System.out.println("[2] For Triangle");
        System.out.println("[3] For Rectangle");
        System.out.println("[4] For Diamond");
        int choice = scan.nextInt();

        while (continueloop) {
            switch (choice) {
                case 1:

                    Square();
                    return;

                case 2:

                    Triangle();
                    return;
                case 3:

                    Rectangle();
                    return;
                case 4:

                    Diamond();
                    return;
                default:
                    Classinvalid.Inv(args);
                    return;

            }
        }

    }

}
