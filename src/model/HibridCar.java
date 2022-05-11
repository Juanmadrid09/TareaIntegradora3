package model;

public class HibridCar extends Automobile implements GasConsumption,BateryConsumption{

    private int tankCapacity;
    private TypeG typeGas;
    private int gasConsume;
    private TypeC TypeCharger;
    private int bateryDuration;
    private int consumeBatery;




    public HibridCar(double basePrice, String brand, int model, double displacement,
            double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle, int numberDoors,
            String polarizedWindows, TypeA typeAutomobile, int tankCapacity, TypeG typeGas,
            TypeC typeCharger, int bateryDuration) {
        super(basePrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle,
                numberDoors, polarizedWindows, typeAutomobile);
        this.tankCapacity = tankCapacity;
        this.typeGas = typeGas;
        this.gasConsume =0;
        TypeCharger = typeCharger;
        this.bateryDuration = bateryDuration;
        this.consumeBatery = 0;
    }


    public double gasConsumption(){
        double answer=0;

        answer=(tankCapacity)*(super.getDisplacement()/180);

            return answer;
        }


        public double bateryConsumption(){
            double answer=0;

            if(TypeCharger.equals(TypeC.FAST)){
                answer=(bateryDuration)*(super.getDisplacement()/200);
                } else
                answer=(bateryDuration+7)*(super.getDisplacement()/200);
                

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

    /**
     * @return TypeC return the TypeCharger
     */
    public TypeC getTypeCharger() {
        return TypeCharger;
    }

    /**
     * @param TypeCharger the TypeCharger to set
     */
    public void setTypeCharger(TypeC TypeCharger) {
        this.TypeCharger = TypeCharger;
    }

    /**
     * @return int return the bateryDuration
     */
    public int getBateryDuration() {
        return bateryDuration;
    }

    /**
     * @param bateryDuration the bateryDuration to set
     */
    public void setBateryDuration(int bateryDuration) {
        this.bateryDuration = bateryDuration;
    }

    /**
     * @return int return the consumeBatery
     */
    public int getConsumeBatery() {
        return consumeBatery;
    }

    /**
     * @param consumeBatery the consumeBatery to set
     */
    public void setConsumeBatery(int consumeBatery) {
        this.consumeBatery = consumeBatery;
    }


public String toString(){

return super.toString()+
"Capacidad del tanque: "+ tankCapacity+"\n"+
"Consumo de gasolina: "+ gasConsume+"\n"+
"Duracion de la bateria: "+bateryDuration+"\n"+
"Consumo de bateria: "+ consumeBatery+ "\n"; 

}

}
