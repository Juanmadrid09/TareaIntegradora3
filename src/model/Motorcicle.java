package model;

public class Motorcicle extends Automobile implements GasConsumption{

    private TypeM typeMotorcicle;
    private int gasCapacity;
    private int gasConsume;
    
    
    public Motorcicle(int numberDoors, String polarizedWindows, TypeA typeAutomobile, TypeM typeMotorcicle, int gasCapacity,
            int gasConsume) {
        super(numberDoors, polarizedWindows, typeAutomobile);
        this.typeMotorcicle = typeMotorcicle;
        this.gasCapacity = gasCapacity;
        this.gasConsume = gasConsume;
    }
    
    
    public double gasConsumption(){
    double answer=0;
        return answer;
    }
    
    
    
    
    }