package in.kunal.beans;

public class DieselEng implements Engine {

	public DieselEng() {
		System.out.println("Diesel Engine Construtor");
	}

	public int start() {
		System.out.println("Engine Start Through Diesel");
		return 1;
	}

}
