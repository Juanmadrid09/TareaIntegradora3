package model;

public class HibridCar extends Automobile implements GasConsumption,BateryConsumption{

    private int tankCapacity;
    private TypeG typeGas;
    private int gasConsume;
    private TypeC TypeCharger;
    private int bateryDuration;
    private int consumeBatery;


    public HibridCar(double basePrice, double sellPrice, String brand, int model, double displacement,
            double kilometers, String plate, Soat soat, TecnoMecanic tecnoMecanic, int numberDoors,
            String polarizedWindows, TypeA typeAutomobile, int tankCapacity, TypeG typeGas, int gasConsume,
            TypeC typeCharger, int bateryDuration, int consumeBatery) {
        super(basePrice, sellPrice, brand, model, displacement, kilometers, plate, soat, tecnoMecanic, numberDoors,
                polarizedWindows, typeAutomobile);
        this.tankCapacity = tankCapacity;
        this.typeGas = typeGas;
        this.gasConsume = gasConsume;
        TypeCharger = typeCharger;
        this.bateryDuration = bateryDuration;
        this.consumeBatery = consumeBatery;
    }


    public double gasConsumption(){
        double answer=0;
            return answer;
        }


        public double bateryConsumption(){
            double answer=0;
            return answer;
            }

}
