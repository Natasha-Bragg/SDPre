import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int userNum;
    int num1 = 0;
    boolean bool1, bool2, bool3;


    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    bool1 = (userNum < num1);
    bool2 = (userNum == num1);
    bool3 = (userNum > num1);

    if(bool1) {
      System.out.println("The number is negative");
}
    else if(bool2) {
      System.out.println("The number is equal");
}
    if(bool3) {
      System.out.println("The number is positive");
}
      scanner.close();
    }
  }
