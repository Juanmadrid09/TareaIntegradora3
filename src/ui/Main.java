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
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menu principal, por favor elija una opcion\n" +
				"(1) Registrar un vehiculo \n" +
				"(2) Calcular el precio total de venta de un vehículo \n"+
				"(3) Generar informes con todos los datos de los vehículos\n"+
				"(4) Mostrar el estado de documentos de un vehiculo\n" +  
                "(5) Mapa del parqueadero\n" +
                "(6) Ocupacion del parqueadero\n"+
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			
			break;
		case 2:
		
			break;
	
		case 3:
			
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}





















}