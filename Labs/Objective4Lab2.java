import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    System.out.print("Please enter the first whole number you would like to add. ");
    int firstNumber = keyboard.nextInt();

    System.out.print("Please enter the second whole number you would like to add. ");
    int secondNumber = keyboard.nextInt();

    System.out.print("Please enter the third whole number you would like to add. ");
    int thirdNumber = keyboard.nextInt();

    System.out.print("Please enter the first decimal number you would like to add. ");
    double firstDub = keyboard.nextDouble();

    System.out.print("Please enter the second decimal number you would like to add. ");
    double secondDub = keyboard.nextDouble();

    System.out.print("Please enter the third decimal number you would like to add. ");
    double thirdDub = keyboard.nextDouble();

    int sum1 = firstNumber + secondNumber + thirdNumber;

    double sum2 = firstDub + secondDub + thirdDub;

    System.out.println("The sum of " + "" + firstNumber + " " + "+" + " " + secondNumber + " " + "+" + " " + thirdNumber + " " + "=" + " " + sum1);
    System.out.println("The sum of " + "" + firstDub + " " + "+" + " " + secondDub + " " + "+" + " " + thirdDub + " " + "=" + " " + sum2);

  }
}
