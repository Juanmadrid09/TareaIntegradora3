package model;

public abstract class  Automobile extends Vehicle{

private int numberDoors;
private String polarizedWindows;
private TypeA typeAutomobile;


public Automobile(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
        String plate, Soat soat, TecnoMecanic tecnoMecanic, int numberDoors, String polarizedWindows,
        TypeA typeAutomobile) {
    super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic);
    this.numberDoors = numberDoors;
    this.polarizedWindows = polarizedWindows;
    this.typeAutomobile = typeAutomobile;
}









}
