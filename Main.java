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
  }

  // method calculates ave
  static int aveGrade(int lowestGrade, int highestGrade) {
    int grade = lowestGrade + highestGrade;
    int ave = grade / 2;
    return ave;
  
    }
  }
