package JustForFun;

import java.util.Scanner;

public class PagesPerDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysTillEndOfTheBreak = Integer.parseInt(scanner.nextLine());
        int pagesAll = Integer.parseInt(scanner.nextLine());
        int pages8grade = Integer.parseInt(scanner.nextLine());
        int pages9grade = Integer.parseInt(scanner.nextLine());
        int optionalPages = Integer.parseInt(scanner.nextLine());
        int read = Integer.parseInt(scanner.nextLine());
        // като знаем това можем да си открием страниците с литературата за 10-ти клас

        int pages10grade = pagesAll - (pages8grade + pages9grade + optionalPages) - read;
        double pagesPerDay = pages10grade * 1.0 / daysTillEndOfTheBreak;
        System.out.printf("You need to read %.2f pages per day to read all of it till the end of the break!", pagesPerDay);
    }
}
