* In java one java class to communicate to another java then we are using inheritence (Is-A) or composition (Has-A).

* Using inheritence or composition our java classes are tightly coupled .

* In realtime creating classes with approach is not recommanded.

* We need to create our classes loosely coupled.

                                           Classes Information In this repo:
                                           Engine.java (interface)
                                           Car.java 
                                           PetrolEng.java
                                           DieselEng.java
                                           spring.xml (to configure our java classes as spring beans to manage by IOC Container).

* As a programmer we need to start IOC container.
* IOC take input spring.xml file and read the entire bean classes and perform depedency injection through manual wiring or autowiring. 

* if our classes managed by ioc container we need to follow strategy desing pattern.

   * So spring framework provides Spring core module to provide Ioc container , Dependency Injection and autowiring.
  
   *.Ioc container is principle that is responsible to manage and collabrated dependency and objects to the classes among the application.

   *. Ioc performs dependency injection.
  
   * Dependency injection means injecting dependent object into target object is called as dependency injection.
     we can performs dependency injection in 3 ways:

1. Setter Method
   The process of injecting one class object to another class through setter method are known as setter injection.

2. Constructor Method
    The process of injecting one class object to another class through constructor method are known as constructor injection.
   
3. Field Method
The process of injecting one class object to another class through variable  method are known as Field  injection.


* Autowiring:
  We can perform autowiring in two ways:
  1.Manual Wiring
  2.Autowiring


 * Manual wiring means we need to tell the ioc container to perform dependency injection using ref attribute in spring xml file.
   <prototype name = "engine" ref = "diesel" prototype/>  // Setter  injection
    <consgructor namce = "engine" ref = "petrol" constructor/>  // constructor injection

* Field injection is not supported in Spring xml approach.**

* Autowiring means IOC will automatically identified the dependent obj and target obj and inject it .
We can perfoms autowire in 4 ways:

1.ByName 

 * if target class variable name must be matched with dependent bean variable id.
     <bean id="engine" class= "in.kunal.beans.PetrolEng"/>
     <bean id="car"  class= "in.kunal.beans.Car"  autowired=ByName/>
     
     
2.ByType

* if target class datatype name must be matched with dependent bean.
     <bean id="engine" class= "in.kunal.beans.PetrolEng"/>
     <bean id="car"  class= "in.kunal.beans.Car"  autowired=ByType/>

* if you are using ByName and ByType it will internally use setter method to perform dependency injection.
     

3.Constructor
* if your using constructor injection it will use internally ByType way to perform dependency injection. 
 
4.None

* it will not perform any dependency injection.




    
   
