package model;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Counselor{

    private ArrayList<Vehicle> newCars;
	private ArrayList<Vehicle> oldCars;




    public Counselor() {

newCars= new ArrayList<Vehicle>();
oldCars= new ArrayList<Vehicle>();



    }




public String registElectricCar(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors, String polarizedWindows,
int  typeAutomobile, int  typeCharger, int bateryDuration, int consumeBatery, int typeVehicle){

String answer="";
Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeC typec=null;


if(soat==1){
SOAT= new Soat(price,year,cover);
SOAT.generateImage();
}

if(tecno==1){
TECNO=new TecnoMecanic(priceT, yearT, levelGasT);
TECNO.generateImage();
}

if(typeAutomobile==1){
typea=TypeA.SEDAN;
} else 
typea=TypeA.TRUCK;

if(typeCharger==1){
typec=TypeC.FAST;
} else 
typec=TypeC.NORMAL;

Vehicle electricCar= new ElectricCar(basePrice, sellPrice, brand, model, displacement, kilometers, plate, SOAT, TECNO, numberDoors, polarizedWindows, typea, typec, bateryDuration, consumeBatery);

if(typeVehicle==1){
newCars.add(electricCar);
answer= " se registro correctamente el vehiculo";
} else {
electricCar.generatePropertyCard();
oldCars.add(electricCar);

answer="se registro correctamente el vehiculo";

}



return answer;
}

public String registHibridCar(double basePrice, double sellPrice, String brand, int model, double displacement,
double kilometers, String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors,
String polarizedWindows, int typeAutomobile, int tankCapacity, int  typeGas, int gasConsume,
int typeCharger, int bateryDuration, int consumeBatery,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeC typec=null;
TypeG typeg=null;

if(soat==1){
SOAT= new Soat(price,year,cover);
SOAT.generateImage();
}

if(tecno==1){
TECNO=new TecnoMecanic(priceT, yearT, levelGasT);
TECNO.generateImage();
}

if(typeAutomobile==1){
typea=TypeA.SEDAN;
} else 
typea=TypeA.TRUCK;

if(typeCharger==1){
typec=TypeC.FAST;
} else 
typec=TypeC.NORMAL;

switch(typeGas){

case 1:
typeg=TypeG.CURRENT;
break;
case 2:
typeg=TypeG.DIESEL;
break;
case 3:
typeg=TypeG.EXTRA;
break;

}



Vehicle hibridCAr=new HibridCar(basePrice, sellPrice, brand, model, displacement, kilometers, plate, SOAT, TECNO, numberDoors, polarizedWindows, typea, tankCapacity,typeg, gasConsume, typec, bateryDuration, consumeBatery);

if(typeVehicle==1){
    newCars.add(hibridCAr);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
    hibridCAr.generatePropertyCard();
    oldCars.add(hibridCAr);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }

return answer;
}

public String registGasCar(double basePrice, double sellPrice, String brand, int model, double displacement, double kilometers,
String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors, String polarizedWindows,
int typeAutomobile, int tankCapacity, int typeGas, int gasConsume,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeG typeg=null;

if(soat==1){
SOAT= new Soat(price,year,cover);
SOAT.generateImage();
}

if(tecno==1){
TECNO=new TecnoMecanic(priceT, yearT, levelGasT);
TECNO.generateImage();
}

if(typeAutomobile==1){
typea=TypeA.SEDAN;
} else 
typea=TypeA.TRUCK;

switch(typeGas){

case 1:
typeg=TypeG.CURRENT;
break;
case 2:
typeg=TypeG.DIESEL;
break;
case 3:
typeg=TypeG.EXTRA;
break;

}

Vehicle gasCar=new GasCar(basePrice, sellPrice, brand, model, displacement, kilometers, plate, SOAT, TECNO, numberDoors, polarizedWindows, typea, tankCapacity, typeg, gasConsume);

if(typeVehicle==1){
    newCars.add(gasCar);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
    gasCar.generatePropertyCard();
    oldCars.add(gasCar);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }




return answer;
}

public String registMotorcicle(double basePrice, double sellPrice, String brand, int model, double displacement,
double kilometers, String plate, int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int typeMotorcicle,
int gasCapacity, int gasConsume,int typeGas,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeG typeg=null;
TypeM typem=null;

if(soat==1){
SOAT= new Soat(price,year,cover);
SOAT.generateImage();
}

if(tecno==1){
TECNO=new TecnoMecanic(priceT, yearT, levelGasT);
TECNO.generateImage();
}

switch(typeGas){

case 1:
typeg=TypeG.CURRENT;
break;
case 2:
typeg=TypeG.DIESEL;
break;
case 3:
typeg=TypeG.EXTRA;
break;

}

switch(typeMotorcicle){

case 1:
typem=TypeM.CROSS;
break;

case 2:
typem=TypeM.SCOOTER;
break;

case 3:
typem=TypeM.SPORT;
break;

case 4:
typem=TypeM.STANDARD;
break;

}

Vehicle motorcicle=new Motorcicle(basePrice, sellPrice, brand, model, displacement, kilometers, plate, SOAT, TECNO, typem, gasCapacity, gasConsume, typeg);

if(typeVehicle==1){
    newCars.add(motorcicle);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
   motorcicle.generatePropertyCard();
    oldCars.add(motorcicle);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }

return answer;
}













}
