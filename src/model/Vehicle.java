package model;



public  abstract class Vehicle{
	
	
	private double basePrice;
	private double sellPrice;
	private String brand;
	private int model;
	private double displacement;
	private double kilometers;
	private String plate;
	private int [][] propertyCard;
	
	
	public Vehicle( double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers, String plate){
		
		this.basePrice=basePrice;
		this.sellPrice=sellPrice;
		this.brand=brand;
		this.model=model;
		this.displacement=displacement;
		this.kilometers=kilometers;
		this.plate=plate;
		propertyCard= new int[4][4];


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}