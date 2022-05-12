package model;

import javax.swing.plaf.TreeUI;

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
	private TypeV typevehicle;
    private String id;
	



	public Vehicle( double basePrice, String brand, int model, double displacement, double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic,TypeV typevehicle){
		
		this.basePrice=basePrice;
		this.sellPrice=0;
		this.brand=brand;
		this.model=model;
		this.displacement=displacement;
		this.kilometers=kilometers;
		this.plate=plate;
		this.soat=soat;
		this.tecnoMecanic=tecnoMecanic;
		propertyCard= new int[4][4];
        this.typevehicle=typevehicle;
		id="";
		for(int i=0;i<6;i++){
        id=id+(int)(Math.random()*(10-1));
		}
        
	}
	
	

public void generatePropertyCard(){

    for (int x=0; x < propertyCard.length; x++) {
        for (int y=0; y < propertyCard[0].length; y++) {
             propertyCard[x][y] = (int)(Math.random()*(10-1));
              }
              }



}


	
public String decryptionPropertyCard(){
    String answer="";
        for (int x=3; x >=0; x--) {
            for (int y=3; y >=0; y--) {
                 if((x+y)%2==0){
                     answer=answer+propertyCard[x][y]; 
                 }
                  }
                  }
    
    return answer;
    
    }
	
	
	public String documents(){
String answer="";
String s="";
String t="";
String p="";

if(soat==null){

 s="Soat: \n"+"Disculpe este vehiculo no cuenta con Soat \n";

}else 
s= "Soat: \n"+soat.toString()+"\n";

if(tecnoMecanic==null){

    t="Tenco-mecanica: \n"+"Disculpe este vehiculo no cuenta con revision tecno mecanica \n";
   
   }else 
   t= "Tecno-mecanica: \n"+tecnoMecanic.toString()+"\n";

   if(typevehicle.equals(TypeV.NEW)){
p="Tarjeta de propiedad: \n"+ "Este auto al ser nuevo no posee numero de tarjeta de propieda\n";


   }else
   p="Tarjeta de propiedad: \n"+ decryptionPropertyCard()+"\n";



answer=s+t+p;
        return answer;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}

	
	

    /**
     * @return double return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return double return the sellPrice
     */
    public double getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return int return the model
     */
    public int getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * @return double return the displacement
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * @param displacement the displacement to set
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * @return double return the kilometers
     */
    public double getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return String return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return int [][] return the propertyCard
     */
    public int [][] getPropertyCard() {
        return propertyCard;
    }

    /**
     * @param propertyCard the propertyCard to set
     */
    public void setPropertyCard(int [][] propertyCard) {
        this.propertyCard = propertyCard;
    }

    /**
     * @return Soat return the soat
     */
    public Soat getSoat() {
        return soat;
    }

    /**
     * @param soat the soat to set
     */
    public void setSoat(Soat soat) {
        this.soat = soat;
    }

    /**
     * @return TecnoMecanic return the tecnoMecanic
     */
    public TecnoMecanic getTecnoMecanic() {
        return tecnoMecanic;
    }

    /**
     * @param tecnoMecanic the tecnoMecanic to set
     */
    public void setTecnoMecanic(TecnoMecanic tecnoMecanic) {
        this.tecnoMecanic = tecnoMecanic;
    }


	public TypeV getTypevehicle() {
		return typevehicle;
	}



	public void setTypevehicle(TypeV typevehicle) {
		this.typevehicle = typevehicle;
	}

public String toString(){

return "\nEl precio base del vehiculo es: "+ basePrice +"\n"+
" El precio de venta del vehiculo es: "+ sellPrice + "\n" +
"La marca del vehiculo es: "+ brand + "\n" +
"El modelo del vehiculo es: "+ model + "\n"+
"El cilindraje del vehiculo es: "+ displacement + "\n"+
"Kilometros recorridos por el carro: "+ kilometers + "\n"+
"Placa del vehiculo: "+ plate +"\n "+ 
"Id del vehiculo: "+ id+ "\n";


}

}