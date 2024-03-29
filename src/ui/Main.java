package ui;


import java.util.Scanner;
import model.Counselor;

public class Main{


    private Scanner sc;
    private Counselor counselor;


    public Main(){
		sc= new Scanner(System.in);
		counselor = new Counselor();
	}

    public static void main(String[] args) {
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	/**
     * Method that shows the menu of the program
     * @return int the option that the user has selected
     */
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menu principal, por favor elija una opcion\n" +
				"(1) Registrar un vehiculo \n" +
				"(2) Calcular el precio total de venta de un vehiculo \n"+
				"(3) Generar informes con todos los datos de los vehiculos\n"+
				"(4) Mostrar el estado de documentos de un vehiculo\n" +  
                "(5) Mapa del parqueadero\n" +
                "(6) Ocupacion del parqueadero\n"+
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	 /**
     * Method that executes the option that the user has entered
     * @param option with the number of the option that the user has selected
     */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registrarVehiculo();
			break;
		case 2:
		    calculatePrice();
			break;
	
		case 3:
			generateInfo();
			break;

		case 4:
			generateDocs();
			break;
		
        case 5:
		    map();
        break;

        case 6:
		ocupationParking();
        break;

		default:
			System.out.println("Error, wrong option");
		
		}
	

	}
/**
 * Method that executes the first option of the menu
 */
public void registrarVehiculo(){


	System.out.println("Buenas, el vehiculo es nuevo(1) o es usado(2)?");
    int typeVehicle=sc.nextInt();
	while(typeVehicle<1 || typeVehicle>2){
		System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		typeVehicle=sc.nextInt();
	}

	System.out.println("Su vehiculo tiene soat(Si(1)/No(2))");
	int soat=sc.nextInt();
	double price=0;
	int year=0;
	double cover=0;
	while(soat<1 || soat>2){
		System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		soat=sc.nextInt();
	}
    if(soat==1){
		System.out.println("¿Cual es el precio de este documento?");
		 price=sc.nextDouble();
		System.out.println("¿En que año se vence el Soat?");
		year=sc.nextInt();
		System.out.println("¿De cuanto es el monto de cobertura por accidente?");
		 cover=sc.nextDouble();
		
		
	}
    System.out.println("¿El vehiculo tiene revision tecno mecanica?(Si(1)/No(2))");

		int tecno=sc.nextInt();
		double priceT=0;
		int yearT=0;
		double levelGas=0;
		while(tecno<1 || tecno>2){
			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		tecno=sc.nextInt();
		}
    if(tecno==1){
		System.out.println("¿Cual es el precio de este documento?");
		 priceT=sc.nextDouble();
		System.out.println("¿En que año se vence la revision?");
		 yearT=sc.nextInt();
		System.out.println("¿Cual es el nivel de gas que indico el Vehiculo?");
		 levelGas=sc.nextDouble();
	
	}

	System.out.println("¿Cual es el precio base del Vehiculo?");
	double basePrice=sc.nextDouble();



	System.out.println("¿Cual es la marca del Vehiculo?");
	String brand=sc.nextLine();
	brand=sc.nextLine();

	System.out.println("¿Que modelo es el Vehiculo?");
	int model=sc.nextInt();

	System.out.println("¿De cuanto es el cilindraje del Vehiculo?");
	double displacement =sc.nextDouble();

	System.out.println("¿Cuantos kilomtros ha recorrido el Vehiculo?");
	double kilometers=sc.nextDouble();

	String plate;
	if(typeVehicle!=1){
	System.out.println("¿Cual es la placa de este Vehiculo?");
	plate =sc.next();
	} else
	plate="Sin asignar";


	System.out.println("El vehiculo es un automobil(1) o es una motocicleta(2)? ");
	int typeCar=sc.nextInt();
	while(typeCar<1 || typeCar>2){
		System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		typeCar=sc.nextInt();

		
	}
if(typeCar==1){

	System.out.println("El automobil es un Sedan(1) o una camioneta(2)");
	int typea=sc.nextInt();

	System.out.println("¿Cuantas puertas tiene el automobil?");
	 int numberDoors=sc.nextInt();

	 System.out.println("¿El vehiculo tiene vidrios polarizados?(Si/No)");
		String polarizedWindows=sc.next();
		polarizedWindows= polarizedWindows.toUpperCase();
int flag=2;
		while( flag==2){
			if(polarizedWindows.equals("SI") || polarizedWindows.equals("NO")){
				flag=1;
		} else{
			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
			polarizedWindows=sc.next();
		    polarizedWindows= polarizedWindows.toUpperCase();
		}
		}

	System.out.println("El automobil es: \n"+" Electrico(1)\n"+"Gasolina(2)\n"+"Hibrido(3)");
		int typeAutomobile=sc.nextInt();
		while(typeAutomobile<1 || typeAutomobile>3){
			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		typeAutomobile=sc.nextInt();
		}
        switch(typeAutomobile){

         case 1:

		 System.out.println("Que tipo de cargador tiene el carro:\n"+"Rapido(1)\n"+"Normal(2)");
		 int typec=sc.nextInt();
		 while(typec<1 || typec>2){
			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
			typec=sc.nextInt();
		 }

		 System.out.println(" Cuantos kilometros dura la bateria del carro?");
		 int bateryDuration=sc.nextInt();

		 System.out.println( counselor.registElectricCar(basePrice, brand, model, displacement, kilometers, plate, soat, price, year, cover, tecno, priceT, yearT, levelGas, numberDoors, polarizedWindows, typea, typec, bateryDuration, typeVehicle));
break;

         case 2:

		 System.out.println("¿Que tipo de gasolina consume el carro?:\n"+"Corriente(1)\n"+"Diesel(2)\n"+"Extra(3)");
			int typeg=sc.nextInt();

        while(typeg<1 || typeg>3){

			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
			typeg=sc.nextInt();

		}

		System.out.println("¿Cual es la capacidad del tanque en galones?");
		int tankCapacity=sc.nextInt();

	

		System.out.println( counselor.registGasCar(basePrice, brand, model, displacement, kilometers, plate, soat, price, year, cover, tecno, priceT, yearT, levelGas, numberDoors, polarizedWindows, typea, tankCapacity, typeg, typeVehicle));

 break;

         case 3:

		 System.out.println("Que tipo de cargador tiene el carro:\n"+"Rapido(1)\n"+"Normal(2)");
		 int typech=sc.nextInt();
		 while(typech<1 || typech>2){
			System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
			typech=sc.nextInt();
		 }

		 System.out.println(" Cuantos kilometros dura la bateria del carro?");
		 int bateryDurationh=sc.nextInt();


		 System.out.println("¿Que tipo de gasolina consume el carro?:\n"+"Corriente(1)\n"+"Diesel(2)\n"+"Extra(3)");
		 int typegh=sc.nextInt();

	 while(typegh<1 || typegh>3){

		 System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		 typegh=sc.nextInt();

	 }

	 System.out.println("¿Cual es la capacidad del tanque en galones?");
	 int tankCapacityh=sc.nextInt();

	


	 System.out.println( counselor.registHibridCar(basePrice, brand, model, displacement, kilometers, plate, soat, price, year, cover, tecno, priceT, yearT, levelGas, numberDoors, polarizedWindows, typea, tankCapacityh, typegh, typech, bateryDurationh, typeVehicle));

 break;

		}
}  else{

	System.out.println("La moto que tipo es:\n"+"Cross(1)\n"+"Scooter(2)\n"+"Deportiva(3)\n"+"estandar(4)");
	int typem=sc.nextInt();

	while(typem<1 || typem>4){
		System.out.println("Por favor eliga una de las opciones mostradas en pantalla");
		 typem=sc.nextInt();
	}

	System.out.println("¿Que tipo de gasolina consume el carro?:\n"+"Corriente(1)\n"+"Diesel(2)\n"+"Extra(3)");
	int typeg=sc.nextInt();

	System.out.println("¿Cual es la capacidad del tanque en galones?");
	int gasCapacity=sc.nextInt();

	

	System.out.println(counselor.registMotorcicle(basePrice, brand, model, displacement, kilometers, plate, soat, price, year, cover, tecno, priceT, yearT, levelGas, typem, gasCapacity, typeg, typeVehicle));


	
}

	
}
/**
 * Method that executes the option 2 of the menu
 */
public void calculatePrice(){

	System.out.println("Por favor ingrese el id del vehiculo del cual quiere saber su precio total");
String id=sc.next();

System.out.println(counselor.calculatePrice(id));


}
/**
 * Method that executes the option 3 of the menu
 */
public void generateInfo(){
	System.out.println("\n");
counselor.ShowVehicles();

}
/**
 * Method that executes the option 4 of the menu
 */
public void generateDocs(){

	System.out.println("Por favor ingrese el id del vehiculo del cual quiere saber la informacion de sus documentos");
	String id=sc.next();


	System.out.println("\n");
	System.out.println(counselor.ShowDocuments(id));


}

/**
 * Method that executes the option 5 of the menu
 */
public void map(){

	System.out.println("\n");
	System.out.println(counselor.printParking());





}

/**
 * Method that executes the option 6 of the menu
 */
public void ocupationParking(){

	int option=0;

	System.out.println("Que informacion desea: \n"+"(1) Listado de vehiculos dado un rango\n"+"(2) Datos del vehiculo mas viejo y nuevo\n"+"(3) Porcentaje de ocupacion del parqueadero\n");
    option= sc.nextInt();

	if(option>3 || option<1){
		System.out.println("Por favor ingrese una de las opciones presentadas en pantalla");
		option= sc.nextInt();
	}
    
switch(option){

case 1:

System.out.println("De que modelo desea ver la informacion de los vehiculos:\n"+"(1)2014\n"+"(2)2013\n"+"(3)2012\n"+"(4)2011\n"+"(5)Menores a 2011");
int answer=sc.nextInt();

if(answer>5 || answer<1){
	System.out.println("Por favor ingrese una de las opciones presentadas en pantalla");
	answer= sc.nextInt();
}

System.out.println(counselor.generateInfo(answer));


break;

case 2:

System.out.println(counselor.oldNewInfo());

break;


case 3: 

System.out.println(counselor.percentageParking());

break;

}




}








}