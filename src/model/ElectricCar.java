package model;

public class ElectricCar extends Automobile implements BateryConsumption{

private TypeC TypeCharger;
private int bateryDuration;
private int consumeBatery;



public ElectricCar(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile, TypeC typeCharger, int bateryDuration, int consumeBatery) {
    super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, numberDoors,
            polarizedWindows, typeAutomobile);
    TypeCharger = typeCharger;
    this.bateryDuration = bateryDuration;
    this.consumeBatery = consumeBatery;
}









public double bateryConsumption(){
double answer=0;
return answer;
}






}
