package model;

public class Motorcicle extends Vehicle implements GasConsumption{

    private TypeM typeMotorcicle;
    private int gasCapacity;
    private int gasConsume;
    private TypeG typeGas;


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
 * @param typeMotorcicle
 * @param gasCapacity
 * @param typeGas
 */
    public Motorcicle(double basePrice, String brand, int model, double displacement,
            double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle,
            TypeM typeMotorcicle, int gasCapacity, TypeG typeGas) {
        super(basePrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle);
        this.typeMotorcicle = typeMotorcicle;
        this.gasCapacity = gasCapacity;
        this.gasConsume =0;
        this.typeGas = typeGas;
    }




@Override
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

    public String toString(){

        return super.toString()+
        "Capacidad del tanque: "+ gasCapacity+"\n"+
        "Consumo de gasolina: "+ gasConsume+"\n";
        }


}