package in.kunal;

import in.kunal.beans.Car;
import in.kunal.beans.PetrolEng;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Car car = new Car();
    	PetrolEng eng = new PetrolEng();
    	car.setEngine(eng);
    }
}
