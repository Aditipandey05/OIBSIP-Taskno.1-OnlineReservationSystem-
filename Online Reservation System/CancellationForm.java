import java.util.Scanner;

public class CancellationForm {

    public static void cancelTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PNR Number: ");
        String pnrNumber = scanner.nextLine();

        String ticketDetails = getTicketDetails(pnrNumber);

        System.out.println("Ticket Details: " + ticketDetails);

        System.out.print("Are you sure you want to cancel this ticket? (yes/no): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
           
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("Cancellation aborted.");
        }

        scanner.close();
    }

    private static String getTicketDetails(String pnrNumber) {
        return "Train: Express Train, Date: 12-12-2024, From: CityA, To: CityB";
    }

    public static void main(String[] args) {
        cancelTicket();
    }
}
