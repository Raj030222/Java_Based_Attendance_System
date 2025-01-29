import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        MenuItems menu = new MenuItems();
        menu.showMenu();
    }
}

class MenuItems {

    // Method to display the menu
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Operations.addAttendance();
                    break;
                case 2:
                    Operations.fetchAttendance();
                    break;
                case 3:
                    Operations.displayAllAttendance();
                    break;
                case 4:
                    Operations.totalClasses();
                    break;
                case 5:
                    Operations.searchStudent();
                    break;
                case 6:
                    deleteRecord(scanner);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    break;
            }
        } while (true);
    }

    // Method to display the menu options
    private void displayMenu() {
        System.out.println("*************************************************************************************************************************************");
        System.out.println("              STUDENT ATTENDANCE RECORDS ADMIN PANEL");
        System.out.println("*************************************************************************************************************************************");
        System.out.println("PRESS 1 : Add Attendance");
        System.out.println("PRESS 2 : Fetch Attendance Details");
        System.out.println("PRESS 3 : Display All Attendance");
        System.out.println("PRESS 4 : Show Total Class IDs");
        System.out.println("PRESS 5 : Search Student");
        System.out.println("PRESS 6 : Delete Record by Serial Number");
        System.out.println("PRESS 7 : Exit");
        System.out.println("*************************************************************************************************************************************");
    }

    // Method to handle the delete record operation
    private void deleteRecord(Scanner scanner) {
        System.out.print("Enter the serial number to delete the record: ");
        int id = scanner.nextInt();
        Operations.delete(id);
    }
}
