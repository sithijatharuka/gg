package Packages;

public class Patient extends Person {
  private MedicalHistory medicalHistory;

  public Patient(String name, int id, String address, String phone, MedicalHistory medicalHistory) {
    super(name, id, address, phone);
    this.medicalHistory = medicalHistory;
  }

  public MedicalHistory getMedicalHistory() {
    return medicalHistory;
  }
  
  public String toString() {
    return getName() + "\n" + "    Address: " + getAddress() + "\n" + "    Phone: " + getPhone() + "\n"
        + "    Diseases Diagnosed: " + getMedicalHistory().getDiseasesDiagnosed() + "\n"
        + "    Medications Prescribed: " + getMedicalHistory().getMedicationsPrescribed();
  }
}