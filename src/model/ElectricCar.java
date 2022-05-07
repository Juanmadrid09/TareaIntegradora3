package model;

public class ElectricCar extends Automobile implements BateryConsumption{

private TypeC TypeCharger;
private int bateryDuration;
private int consumeBatery;


public ElectricCar(int numberDoors, String polarizedWindows, TypeA typeAutomobile, TypeC typeCharger,
        int bateryDuration, int consumeBatery) {
    super(numberDoors, polarizedWindows, typeAutomobile);
    TypeCharger = typeCharger;
    this.bateryDuration = bateryDuration;
    this.consumeBatery = consumeBatery;
}


public double bateryConsumption(){
double answer=0;
return answer;
}






}
