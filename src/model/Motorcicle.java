package model;

public class Motorcicle extends Vehicle implements GasConsumption{

    private TypeM typeMotorcicle;
    private int gasCapacity;
    private int gasConsume;
    private TypeG typeGas;



    public Motorcicle(double basePrice, double sellPrice, String brand, int model, double displacement,
            double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle,
            TypeM typeMotorcicle, int gasCapacity, TypeG typeGas) {
        super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle);
        this.typeMotorcicle = typeMotorcicle;
        this.gasCapacity = gasCapacity;
        this.gasConsume =0;
        this.typeGas = typeGas;
    }





    public double gasConsumption(){
    double answer=0;

    answer=(gasCapacity)*(super.getDisplacement()/75);
        return answer;
    }
    
    
    
    
    
    /**
     * @return TypeM return the typeMotorcicle
     */
    public TypeM getTypeMotorcicle() {
        return typeMotorcicle;
    }

    /**
     * @param typeMotorcicle the typeMotorcicle to set
     */
    public void setTypeMotorcicle(TypeM typeMotorcicle) {
        this.typeMotorcicle = typeMotorcicle;
    }

    /**
     * @return int return the gasCapacity
     */
    public int getGasCapacity() {
        return gasCapacity;
    }

    /**
     * @param gasCapacity the gasCapacity to set
     */
    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
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

}