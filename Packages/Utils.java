package Packages;

import java.util.Scanner;
import java.util.ArrayList;

public class Utils {
    Scanner sc = new Scanner(System.in);

    public final String hospitalName = "Hospital Management System";
    public final String hospitalAddress = "Hospital Management System";

    Hospital hospital = new Hospital(hospitalName, hospitalAddress);

    public String[] menuList = {
            "1. Add New Department",
            "2. Add New Doctor",
            "3. Add New Patient",
            "4. View Departments",
            "5. View Doctors",
            "6. View Patients",
            "7. Exit"
    };

    public void getMenu() {
        for (int i = 0; i < menuList.length; i++) {
            System.out.println(menuList[i]);
        }
    }

    public void welcomeMsg() {
        System.out.println("\n\n" + hospital.getName());
        System.out.println("--------------------------\n");
    }

    public void defaultMsg() {
        System.out.println("Invalid Range");
    }

    public void exitSystem() {
        System.out.println("Thank you for using the Hospital Management System.\n");
        System.exit(0);
    }

    // All Array List to Add Departments , Doctors , Patients

    public ArrayList<Department> department = new ArrayList<Department>();
    public ArrayList<Patient> patients = new ArrayList<Patient>();
    public ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    // Array List for Patients MedicalHistory class
    ArrayList<String> diseases_diagnosed = new ArrayList<>();
    ArrayList<String> medications_prescribed = new ArrayList<>();

    // Add Sample Data

    public void addSampleData() {

        // Add Sample Data for Departments

        department.add(new Department("Acc0ent and emergency (A&E)", 0));
        department.add(new Department("Cardiology", 1));
        department.add(new Department("Critical care", 2));

        // Add Sample Data for Doctors

        doctors.add(new Doctor("John Smith", 0, "123 Main Street, Cityville, State", "(555) 123-4567", "Cardiologist"));
        doctors.add(
                new Doctor("Sarah Johnson", 0, "456 Elm Avenue, Townsville, State", "(555) 987-6543", "Dermatologist"));
        doctors.add(new Doctor("Michael Brown", 0, "789 Oak Road, Villageton, State", "(555) 555-5555",
                " Orthopedic Surgeon"));

        // Add sample Data for Patients

        // adding first patients
        patients.add(new Patient("John Doe", 0, "123 Main Street, Cityville, State", "(555) 123-4567",
                new MedicalHistory(diseases_diagnosed, medications_prescribed)));
        diseases_diagnosed.add("Influenza");
        medications_prescribed.add("Oseltamivir");

        // adding second patients
        patients.add(new Patient("Christopher Lee", 0, "444 Birch Avenue, Ruralville, State", "(555) 333-7777",
                new MedicalHistory(diseases_diagnosed, medications_prescribed)));
        diseases_diagnosed.add("Type 2 Diabetes");
        medications_prescribed.add("Metformin");

    }

    // System Operations [Add/Get Doctors , Patient , Departments]

    // Add Doctor

    public void addDoctor(int id) {

        System.out.print("\nEnter Doctor Name: ");
        String nam = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Doctor Added Successfully!\n");

        doctors.add(new Doctor(nam, id, address, phone, spec));
    }

    // Get Doctors

    public void getDoctors() {
        System.out.println("\nDoctors:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + doctors.get(i).toString() + "\n");
        }
    }

    // Add Patient

    public void addPatient(int id) {
        System.out.print("\nEnter Patient Name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter Address: ");
        String patientAddress = sc.nextLine();

        System.out.print("Enter Phone: ");
        String patientPhone = sc.nextLine();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.print("Enter Diseses Diagnosed: ");
        String diseasesDiagnosed = sc.nextLine();

        System.out.print("Enter Medications Prescribed: ");
        String medicationsPrescribed = sc.nextLine();

        list1.add(diseasesDiagnosed);
        list2.add(medicationsPrescribed);

        System.out.print("Patient Added Successfully!\n");

        patients.add(new Patient(patientName, id, patientAddress, patientPhone, new MedicalHistory(list1, list2)));
    }

    // Get Patients

    public void getPatients() {
        System.out.println("\nPatients:");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + patients.get(i).toString() + "\n");
        }
    }

    // Add Department
    public void addDepartment(int id) {
        System.out.print("\nEnter Department Name: ");
        String name = sc.nextLine();
        System.out.print("Department Added Successfully!\n");
        department.add(new Department(name, id));
    }

    // Get Departments
    public void getDepartments() {
        System.out.println("\nDepartments:");
        for (int i = 0; i < department.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + department.get(i).getName());
        }
    }
}
