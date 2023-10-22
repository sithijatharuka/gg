package Packages;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int id, String address, String phone, String specialization) {
        super(name, id, address, phone);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString() {
        return "Dr. " + getName() + "\n" + "    Specialization: " + getSpecialization();
    }
}
