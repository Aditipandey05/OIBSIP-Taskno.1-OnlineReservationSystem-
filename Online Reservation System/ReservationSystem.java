import java.util.Scanner;

public class ReservationSystem {

    public static void reserveTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.nextLine();

        
        String trainName = getTrainName(trainNumber);

        System.out.print("Class Type (e.g., Sleeper, AC): ");
        String classType = scanner.nextLine();

        System.out.print("Date of Journey (DD-MM-YYYY): ");
        String dateOfJourney = scanner.nextLine();

        System.out.print("From: ");
        String from = scanner.nextLine();

        System.out.print("To: ");
        String to = scanner.nextLine();

        System.out.println("Ticket reserved successfully for " + name);
        System.out.println("Train: " + trainName + " (" + trainNumber + ")");
        System.out.println("Class: " + classType);
        System.out.println("Date: " + dateOfJourney);
        System.out.println("From: " + from + " To: " + to);

        scanner.close();
    }

    private static String getTrainName(String trainNumber) {
        return "Express Train";
    }

    public static void main(String[] args) {
        reserveTicket();
    }
}
