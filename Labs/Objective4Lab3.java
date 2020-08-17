import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int currentAge = input.nextInt();

    int Year = 2020;
    int bYear = Year - currentAge;

    System.out.println("You were born in " + bYear);
    input.close();
  }
}
