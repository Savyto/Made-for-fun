package JustForFun;

import java.util.Scanner;

public class PrintStatus {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String available = scanner.nextLine();

        switch (available) {
            case "yes":
                System.out.println("Text");
                break;
            case "no":
                System.out.println("anotherText");
                break;
        }
    }
}
