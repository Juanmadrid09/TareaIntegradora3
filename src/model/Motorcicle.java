package model;

public class Motorcicle extends Vehicle implements GasConsumption{

    private TypeM typeMotorcicle;
    private int gasCapacity;
    private int gasConsume;
    private TypeG typeGas;
    
     public Motorcicle(double basePrice, double sellPrice, String brand, int model, double displacement,
            double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeM typeMotorcicle,
            int gasCapacity, int gasConsume,TypeG typeGas) {
        super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic);
        this.typeMotorcicle = typeMotorcicle;
        this.gasCapacity = gasCapacity;
        this.gasConsume = gasConsume;
        this.typeGas=typeGas;
    }





    public double gasConsumption(){
    double answer=0;
        return answer;
    }
    
    
    
    
    }