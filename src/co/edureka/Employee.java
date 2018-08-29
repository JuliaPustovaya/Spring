package co.edureka;

public class Employee {
	int eid;
	String enamne;
	Adress eadress;

	public Employee(int eid, String enamne) {
		this.eid = eid;
		this.enamne = enamne;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"eid=" + eid +
				", enamne='" + enamne + '\'' +
				", eadress='" + eadress + '\'' +
				'}';
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEnamne() {
		return enamne;
	}

	public void setEnamne(String enamne) {
		this.enamne = enamne;
	}

	public Employee() {
	}

	public Employee(Adress adress) {
		this.eadress = adress;
	}

	public Adress getEadress() {
		return eadress;
	}

	public void setEadress(Adress eadress) {
		this.eadress = eadress;
	}
}
