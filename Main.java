
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your First name: ");
    String fname = input.nextLine();
    System.out.print("Enter your Last name: ");
    String lname = input.nextLine();
    System.out.print("Enter your address: ");
    String address = input.nextLine();
    System.out.print("Enter your email: ");
    String email = input.nextLine();
    System.out.println();
    System.out.println("Name: " + fname + " " + lname);
    System.out.println();
    System.out.println("Address: " + address);
    System.out.println();
    System.out.println("Email: " + email);
    System.out.println();
    char index1 = fname.charAt(0);  
    char index2= lname.charAt(0);
    System.out.println("Initials: " + "*" + index1 + index2 + "*");
  }
}
