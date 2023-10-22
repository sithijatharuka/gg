import Packages.Utils;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int choice = 0;
		int index = 0;

		Scanner sc = new Scanner(System.in);

		// innitialize Utils Object
		Utils utils = new Utils();

		utils.addSampleData();

		utils.welcomeMsg();

		// print Menu List
		utils.getMenu();

		do {
			// Get user inputs
			System.out.print("\nPlease enter your choice: ");
			choice = sc.nextInt();

			// Genatrate an number for id argument
			int id = index += 1;

			switch (choice) {
				case 1:
					sc.nextLine();
					utils.addDepartment(id);
					break;

				case 2:
					sc.nextLine();
					utils.addDoctor(id);
					break;
				case 3:
					sc.nextLine();
					utils.addPatient(id);
					break;

				case 4:
					utils.getDepartments();
					break;
				case 5:
					utils.getDoctors();
					break;

				case 6:
					utils.getPatients();
					break;

				case 7:
					utils.exitSystem();
					break;

				default:
					utils.defaultMsg();
					break;
			}

		} while (choice != '7');
	}
}