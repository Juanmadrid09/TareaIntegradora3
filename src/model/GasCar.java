package model;


public class GasCar extends Automobile implements GasConsumption{

private int tankCapacity;
private TypeG typeGas;
private int gasConsume;


public GasCar(int numberDoors, String polarizedWindows, TypeA typeAutomobile, int tankCapacity, TypeG typeGas,
        int gasConsume) {
    super(numberDoors, polarizedWindows, typeAutomobile);
    this.tankCapacity = tankCapacity;
    this.typeGas = typeGas;
    this.gasConsume = gasConsume;
}


public double gasConsumption(){
    double answer=0;
        return answer;
    }



}