package practis;

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	public void introduce() {
		System.out.println("안녕하세요 저는 사람입니다.");
	}
}


class Doctor extends Person{
	public Doctor(String name) {
		super(name);
	}
	@Override
	public void introduce() {
		System.out.println("안녕하세요, 담당하게된" + name + "라고 합니다. 잘 부탁 드립니다.");
	}
	public void treat() {
		System.out.println("환자를 진료합니다.");
	}
}
	class Patient extends Person{
		public Patient(String name) {
			super(name);
		}	
	@Override
	public void introduce() {
		System.out.println("안녕하세요, 진료를 신청한" + name + "라고 합니다. 아무쪼록 잘 부탁드립니다.");
	}
	public void gettreatment() {
		System.out.println("진료를 받습니다.");
	}
}
class Hospital{
	private Doctor doctor;
	
	public Hospital() {
		this.doctor = new Doctor("강감찬");
	}
	
	public void starttretment(Patient patient) {
		System.out.println("병원에서 진료가 시작됩니다.");
		doctor.introduce();
		patient.introduce();
		doctor.treat();
		patient.gettreatment();
	}
}



public class PractisTest {
	public static void main(String[] args) {
		Hospital hopital = new Hospital();
		Patient patient = new Patient("이순신");
		
		 hopital.starttretment(patient);
	}
}
