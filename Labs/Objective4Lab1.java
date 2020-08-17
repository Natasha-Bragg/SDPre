import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.print("What is your first name? ");
    String firstname = keyboard.nextLine();
    System.out.print("What is your last name? ");
    String lastname = keyboard.nextLine();
    System.out.print("What is your favorite animal? ");
    String animal = keyboard.nextLine();
    System.out.print("What is your favorite food? ");
    String food = keyboard.nextLine();
    System.out.print("What is your favorite song? ");
    String song = keyboard.nextLine();
    System.out.println("My name is " + firstname + " " + lastname + ".");
    System.out.println("My favorite animal is " + animal + ".");
    System.out.println("My favorite food is " + food + ".");
    System.out.println("My favorite song is " + song + ".");

    }
}
