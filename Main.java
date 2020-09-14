import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count down or up from:");
    int num = s.nextInt();

    // If statement to see if positive
    if (num >= 0) {// while statement to do countdown
      while (num >= 0) {
        System.out.println(num);
        num--;

      }

    } // Countdown for negative numbers
    else {
      while (num <= 0) {
        System.out.println(num);
        num++;
      }
    }
    // Blast off sign
    System.out.println("Blast off");
    

      }

    
  }

