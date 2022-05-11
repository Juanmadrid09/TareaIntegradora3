package model;

public abstract class  Automobile extends Vehicle{

private int numberDoors;
private String polarizedWindows;
private TypeA typeAutomobile;



    public Automobile(double basePrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile) {
    super(basePrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle);
    this.numberDoors = numberDoors;
    this.polarizedWindows = polarizedWindows;
    this.typeAutomobile = typeAutomobile;
}

    /**
     * @return int return the numberDoors
     */
    public int getNumberDoors() {
        return numberDoors;
    }

    /**
     * @param numberDoors the numberDoors to set
     */
    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    /**
     * @return String return the polarizedWindows
     */
    public String getPolarizedWindows() {
        return polarizedWindows;
    }

    /**
     * @param polarizedWindows the polarizedWindows to set
     */
    public void setPolarizedWindows(String polarizedWindows) {
        this.polarizedWindows = polarizedWindows;
    }

    /**
     * @return TypeA return the typeAutomobile
     */
    public TypeA getTypeAutomobile() {
        return typeAutomobile;
    }

    /**
     * @param typeAutomobile the typeAutomobile to set
     */
    public void setTypeAutomobile(TypeA typeAutomobile) {
        this.typeAutomobile = typeAutomobile;
    }


public String toString(){




return super.toString() +
 "Numero de puertas: "+ numberDoors +"\n"+
 "Vidrios polarizados: "+ polarizedWindows+"\n";
}


}
