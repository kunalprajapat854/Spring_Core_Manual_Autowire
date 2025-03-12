package in.kunal.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		Car car = new Car();
//		DieselEng dieselEng = new DieselEng();
//		PetrolEng petrolEng = new PetrolEng();
//		car.setEngine(dieselEng);
		// car.setEngine(petrolEng);
//		dieselEng.start();
		// petrolEng.start();

//		Car car = new Car(new PetrolEng());  using constructor::
//		car.drive();
		
//		Car car = new Car();
//		PetrolEng eng = new PetrolEng();
//		car.setEngine(eng);   using setter method ::
//	    car.drive();

		
// Using Spring IOc container to inject one class object into another class.
// Ioc container read spring xml file and create object and performs dependency injection
// Ioc use manual wiring or autowired to perform dependency injection
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring IOC Container Started !" + context.getClass().getName());
		Car bean = context.getBean(Car.class);
		bean.drive();
	
		
		int hashCode = bean.hashCode();
		System.out.println(hashCode);
//		System.out.println(bean.getClass().getName());  get object of target class usign context.get bean()
	
		
		
		
	}

}
