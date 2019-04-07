package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
private ArrayList<Doctor> dL = new ArrayList<>();
private ArrayList<Patient> pL = new ArrayList<>();
	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		dL.add(d);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return dL;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		pL.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pL;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

}
