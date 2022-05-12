package model;

public class TecnoMecanic extends Documents{

private double levelGas;

public TecnoMecanic(double price, int year, double levelGas) {
    super(price, year);
    this.levelGas = levelGas;
}


public void generateImage(){

    super.generateImage();
    
    }





    /**
     * @return double return the levelGas
     */
    public double getLevelGas() {
        return levelGas;
    }

    /**
     * @param levelGas the levelGas to set
     */
    public void setLevelGas(double levelGas) {
        this.levelGas = levelGas;
    }
    public int getExpiration(){

        return super.getYear();
    
    }

    public double getPrice(){
        return super.getPrice();
    }

    public String toString(){


        return "Precio de la revision tecno-mecanica: "+super.getPrice()+"\n"+
        "Año de vencimiento: "+super.getYear()+"\n"+
        "Niveles de gases: "+levelGas+ "\n"+
        "Numero de la revision tecno-mecanica: "+super.decryptionTecno()+"\n"+
        super.printNumeric();
        
        
        }

}