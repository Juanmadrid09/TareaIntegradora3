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
	private Soat soat;
	private TecnoMecanic tecnoMecanic;
	
	public Vehicle( double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic){
		
		this.basePrice=basePrice;
		this.sellPrice=sellPrice;
		this.brand=brand;
		this.model=model;
		this.displacement=displacement;
		this.kilometers=kilometers;
		this.plate=plate;
		this.soat=soat;
		this.tecnoMecanic=tecnoMecanic;
		propertyCard= new int[4][4];


	}
	
	

public void generatePropertyCard(){

    for (int x=0; x < propertyCard.length; x++) {
        for (int y=0; y < propertyCard[0].length; y++) {
             propertyCard[x][y] = (int)(Math.random()*(100+1)+1);
              }
              }



}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}