package model;


public class GasCar extends Automobile implements GasConsumption{

private int tankCapacity;
private TypeG typeGas;
private int gasConsume;







/**
 * constructor of the class
 * @param basePrice
 * @param brand
 * @param model
 * @param displacement
 * @param kilometers
 * @param plate
 * @param soat
 * @param tecnoMecanic
 * @param typevehicle
 * @param numberDoors
 * @param polarizedWindows
 * @param typeAutomobile
 * @param tankCapacity
 * @param typeGas
 */
public GasCar(double basePrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile, int tankCapacity, TypeG typeGas) {
    super(basePrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle,
            numberDoors, polarizedWindows, typeAutomobile);
    this.tankCapacity = tankCapacity;
    this.typeGas = typeGas;
    this.gasConsume = 0;
}



@Override
public double gasConsumption(){
    double answer=0;

   answer=(tankCapacity)*(super.getDisplacement()/150);


        return answer;
    }




    /**
     * @return int return the tankCapacity
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * @param tankCapacity the tankCapacity to set
     */
    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    /**
     * @return TypeG return the typeGas
     */
    public TypeG getTypeGas() {
        return typeGas;
    }

    /**
     * @param typeGas the typeGas to set
     */
    public void setTypeGas(TypeG typeGas) {
        this.typeGas = typeGas;
    }

    /**
     * @return int return the gasConsume
     */
    public int getGasConsume() {
        return gasConsume;
    }

    /**
     * @param gasConsume the gasConsume to set
     */
    public void setGasConsume(int gasConsume) {
        this.gasConsume = gasConsume;
    }

public String toString(){

return super.toString()+
"Capacidad del tanque: "+ tankCapacity+"\n"+
"Consumo de gasolina: "+ gasConsume+"\n";
}

}