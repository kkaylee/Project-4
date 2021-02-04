import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What was your highest grade in class?");
    int highestGrade = scan.nextInt();
    System.out.println("What is your lowest grade in class.");
    int lowestGrade = scan.nextInt();
    int ave = aveGrade(lowestGrade, highestGrade);
    System.out.println("Your average grade is " + ave);
    System.out.println("I graded two new tests!");
    int tests = scan.nextInt();
     System.out.println("Here is your new average grade!");
  }
static int tests(int num1, int num2) {
    int tests = num1 + num2;
    int ave = num1 / num2;
    return tests;
}

  static int aveGrade(int lowestGrade, int highestGrade) {
    int grade = lowestGrade + highestGrade;
    int ave = grade / 2;
    return ave;
   
  }
}
