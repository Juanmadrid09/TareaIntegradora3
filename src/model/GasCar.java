package model;


public class GasCar extends Automobile implements GasConsumption{

private int tankCapacity;
private TypeG typeGas;
private int gasConsume;








public GasCar(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile, int tankCapacity, TypeG typeGas) {
    super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle,
            numberDoors, polarizedWindows, typeAutomobile);
    this.tankCapacity = tankCapacity;
    this.typeGas = typeGas;
    this.gasConsume = 0;
}




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

}