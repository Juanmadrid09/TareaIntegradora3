package model;

public class HibridCar extends Automobile implements GasConsumption,BateryConsumption{

    private int tankCapacity;
    private TypeG typeGas;
    private int gasConsume;
    private TypeC TypeCharger;
    private int bateryDuration;
    private int consumeBatery;


    public HibridCar(int numberDoors, String polarizedWindows, TypeA typeAutomobile, int tankCapacity, TypeG typeGas,
            int gasConsume, TypeC typeCharger, int bateryDuration, int consumeBatery) {
        super(numberDoors, polarizedWindows, typeAutomobile);
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
