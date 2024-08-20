import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

       
        if (LoginForm.authenticate(userId, password)) {
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ReservationSystem.reserveTicket();
                    break;
                case 2:
                    CancellationForm.cancelTicket();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } else {
            System.out.println("Login failed.");
        }

        scanner.close();
    }
}

