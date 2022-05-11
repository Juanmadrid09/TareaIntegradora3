package model;

public class ElectricCar extends Automobile implements BateryConsumption{

private TypeC TypeCharger;
private int bateryDuration;
private int consumeBatery;




public ElectricCar(double basePrice, String brand, int model, double displacement, double kilometers,
                String plate, Soat soat, TecnoMecanic tecnoMecanic, TypeV typevehicle, int numberDoors,
                String polarizedWindows, TypeA typeAutomobile, TypeC typeCharger, int bateryDuration) {
        super(basePrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, typevehicle,
                        numberDoors, polarizedWindows, typeAutomobile);
        TypeCharger = typeCharger;
        this.bateryDuration = bateryDuration;
        this.consumeBatery = 0;
}







public double bateryConsumption(){
double answer=0;

if(TypeCharger.equals(TypeC.FAST)){
answer=(bateryDuration+13)*(super.getDisplacement()/100);
} else
answer=(bateryDuration+18)*(super.getDisplacement()/100);

return answer;
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
"Duracion de la bateria: "+bateryDuration+"\n"+
"Consumo de bateria: "+ consumeBatery+ "\n"; 
}


}
