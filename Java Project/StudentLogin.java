import java.util.Scanner;
public class StudentLogin {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
      String username;
	  String password;
    

    System.out.println("Welcome To Java project:");
	
    System.out.println("Enter your username: ");
    username = input.next();

    System.out.println("Enter your password: ");
     password = input.next();


    if(username.equals(username) && password.equals(password)) 
        System.out.println("User name and password is correct");
}

}