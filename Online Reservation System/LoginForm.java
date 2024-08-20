import java.util.Scanner;

public class LoginForm {
    private static final String USER_ID = "admin";
    private static final String PASSWORD = "password123";

    public static boolean authenticate(String userId, String password) {
        return USER_ID.equals(userId) && PASSWORD.equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (authenticate(userId, password)) {
            System.out.println("Login successful! Access granted to the reservation system.");
            
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        scanner.close();
    }
}
