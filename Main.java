import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accpting input from the user
        String day = sc.next();

        // checking which day it is using checkDay() method of Day class
        System.out.println(Day.checkDay(day));

        // closing resource
        sc.close();
    }
}
