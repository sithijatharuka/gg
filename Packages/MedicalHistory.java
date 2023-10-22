package Packages;

import java.util.ArrayList;

public class MedicalHistory {
  private ArrayList<String> diseasesDiagnosed;
  private ArrayList<String> medicationsPrescribed;

  public MedicalHistory(ArrayList<String> diseasesDiagnosed, ArrayList<String> medicationsPrescribed) {
    this.diseasesDiagnosed = diseasesDiagnosed;
    this.medicationsPrescribed = medicationsPrescribed;
  }

  public ArrayList<String> getDiseasesDiagnosed() {
    return diseasesDiagnosed;
  }

  public ArrayList<String> getMedicationsPrescribed() {
    return medicationsPrescribed;
  }
}