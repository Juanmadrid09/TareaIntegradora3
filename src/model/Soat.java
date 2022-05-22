package model;

public class Soat extends Documents{

private double cover;
/**
 * constructor of the class 
 * @param price
 * @param year
 * @param cover
 */
public Soat(double price, int year, double cover) {
    super(price, year);
    this.cover = cover;
}


@Override
public void generateImage(){

super.generateImage();

}



    /**
     * @return double return the cover
     */
    public double getCover() {
        return cover;
    }

    /**
     * @param cover the cover to set
     */
    public void setCover(double cover) {
        this.cover = cover;
    }
    public int getExpiration(){

        return super.getYear();
    
    }

    public double getPrice(){
        return super.getPrice();
    }
    public String toString(){


        return "Precio del soat: "+super.getPrice()+"\n"+
        "Año de vencimiento: "+super.getYear()+"\n"+
        "Cobertura por daños: "+cover+ "\n"+
        "Numero del Soat: "+super.decryptionSoat()+"\n";
        
        }
}

