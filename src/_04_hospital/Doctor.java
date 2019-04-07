package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
private ArrayList<Patient> aP = new ArrayList<>();
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (aP.size() >= 3) {
			throw new DoctorFullException();
		}
		aP.add(patient);
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return aP;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient p: aP) {
			p.checkPulse();
		}
	}

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return null;
	}

}
