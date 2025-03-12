package in.kunal.beans;

public class PetrolEng implements Engine {

	public PetrolEng() {
		System.out.println("Petrol Engine Construtor!");
	}

	public int start() {
		System.out.println("Engine Start Through Petrol");
		return 1;
	}

}
