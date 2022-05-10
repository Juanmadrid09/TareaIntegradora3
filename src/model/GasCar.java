package model;


public class GasCar extends Automobile implements GasConsumption{

private int tankCapacity;
private TypeG typeGas;
private int gasConsume;


public GasCar(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile, int tankCapacity, TypeG typeGas, int gasConsume) {
    super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, numberDoors,
            polarizedWindows, typeAutomobile);
    this.tankCapacity = tankCapacity;
    this.typeGas = typeGas;
    this.gasConsume = gasConsume;
}





public double gasConsumption(){
    double answer=0;
        return answer;
    }



}