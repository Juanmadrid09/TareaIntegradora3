package model;
import java.util.ArrayList;

public class Counselor{

    private ArrayList<Vehicle> Cars;
	




    public Counselor() {

Cars= new ArrayList<Vehicle>();




    }




public String registElectricCar(double basePrice, String brand, int model, double displacement, double kilometers,
String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors, String polarizedWindows,
int  typeAutomobile, int  typeCharger, int bateryDuration, int typeVehicle){

String answer="";
Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeC typec=null;
TypeV typev=null;


if(typeVehicle==1){
    typev=TypeV.NEW;
} else
typev=TypeV.OLD;

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

Vehicle electricCar= new ElectricCar(basePrice, brand, model, displacement, kilometers, plate, SOAT, TECNO,typev, numberDoors, polarizedWindows, typea, typec, bateryDuration);

if(typeVehicle==1){
Cars.add(electricCar);
answer= " se registro correctamente el vehiculo";
} else {
electricCar.generatePropertyCard();
Cars.add(electricCar);

answer="se registro correctamente el vehiculo";

}

answer= answer +"\n"+ "el id de su vehiculo es: "+electricCar.getId();

return answer;
}

public String registHibridCar(double basePrice, String brand, int model, double displacement,
double kilometers, String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors,
String polarizedWindows, int typeAutomobile, int tankCapacity, int  typeGas,
int typeCharger, int bateryDuration,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeC typec=null;
TypeG typeg=null;
TypeV typev=null;


if(typeVehicle==1){
    typev=TypeV.NEW;
} else
typev=TypeV.OLD;



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



Vehicle hibridCAr=new HibridCar(basePrice, brand, model, displacement, kilometers, plate, SOAT, TECNO,typev, numberDoors, polarizedWindows, typea, tankCapacity,typeg, typec, bateryDuration);

if(typeVehicle==1){
    Cars.add(hibridCAr);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
    hibridCAr.generatePropertyCard();
    Cars.add(hibridCAr);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }

    answer= answer +"\n"+ "el id de su vehiculo es: "+hibridCAr.getId();

return answer;
}

public String registGasCar(double basePrice, String brand, int model, double displacement, double kilometers,
String plate,int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int numberDoors, String polarizedWindows,
int typeAutomobile, int tankCapacity, int typeGas,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeA typea=null;
TypeG typeg=null;
TypeV typev=null;


if(typeVehicle==1){
    typev=TypeV.NEW;
} else
typev=TypeV.OLD;

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

Vehicle gasCar=new GasCar(basePrice, brand, model, displacement, kilometers, plate, SOAT, TECNO,typev, numberDoors, polarizedWindows, typea, tankCapacity, typeg);

if(typeVehicle==1){
    Cars.add(gasCar);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
    gasCar.generatePropertyCard();
    Cars.add(gasCar);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }


    answer= answer +"\n"+ "el id de su vehiculo es: "+gasCar.getId();

return answer;
}

public String registMotorcicle(double basePrice, String brand, int model, double displacement,
double kilometers, String plate, int soat,double price, int year, double cover,int tecno, double priceT, int yearT, double levelGasT, int typeMotorcicle,
int gasCapacity,int typeGas,int typeVehicle){

String answer="";

Soat SOAT=null;
TecnoMecanic TECNO=null;
TypeG typeg=null;
TypeM typem=null;
TypeV typev=null;


if(typeVehicle==1){
    typev=TypeV.NEW;
} else
typev=TypeV.OLD;

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

Vehicle motorcicle=new Motorcicle(basePrice, brand, model, displacement, kilometers, plate, SOAT, TECNO,typev, typem, gasCapacity, typeg);

if(typeVehicle==1){
    Cars.add(motorcicle);
    answer= " se registro correctamente el vehiculo nuevo ";
    } else {
   motorcicle.generatePropertyCard();
    Cars.add(motorcicle);
    
    answer="se registro correctamente el vehiculo antiguo";
    
    }

    answer= answer +"\n"+ "el id de su vehiculo es: "+motorcicle.getId();

return answer;
}


public String  calculatePrice(String id){

String ans="";
double answer=0;


for(int i=0;i<Cars.size();i++){

if(Cars.get(i).getId().equals(id)){

if(Cars.get(i).getSoat()==null && Cars.get(i).getTecnoMecanic()==null ){
answer=answer+500000;
} 
else if(Cars.get(i).getSoat().getExpiration()<2022 && Cars.get(i).getTecnoMecanic().getExpiration()<2022 ){

answer=answer+Cars.get(i).getSoat().getPrice()+Cars.get(i).getTecnoMecanic().getPrice()+500000;

}

if(Cars.get(i).getTypevehicle().equals(TypeV.OLD)){
    
if(Cars.get(i) instanceof Motorcicle){
    answer=answer-((Cars.get(i).getBasePrice()*2)/100);
}else
answer=answer-((Cars.get(i).getBasePrice()*10)/100);

}

if(Cars.get(i) instanceof ElectricCar){

answer=answer+Cars.get(i).getBasePrice()+((Cars.get(i).getBasePrice()*20)/100);

}

if(Cars.get(i) instanceof GasCar){

    answer=answer+Cars.get(i).getBasePrice();
    
    }

 if(Cars.get(i) instanceof HibridCar ){

     answer=answer+Cars.get(i).getBasePrice()+((Cars.get(i).getBasePrice()*15)/100);
        
      }

      if(Cars.get(i) instanceof Motorcicle ){

        answer=answer+Cars.get(i).getBasePrice()+((Cars.get(i).getBasePrice()*4)/100);
           
         }


ans="El precio total de venta es: "+answer; 
Cars.get(i).setSellPrice(answer);


} else
ans= " No se encontro el carro que ingreso";



}

return ans;


}
public void ShowVehicles(){

    System.out.println("AUTOMOBILES: \n\n");
    System.out.println("ELECTRICOS: \n\n");
     for(int i=0;i<Cars.size();i++){
    if(Cars.get(i) instanceof ElectricCar){
        calculatePrice(Cars.get(i).getId());
    ((ElectricCar)Cars.get(i)).getConsumeBatery();
    System.out.println(((ElectricCar)Cars.get(i)).toString());
    }
    }
    System.out.println("\n GASOLINA: \n\n");
    for(int i=0;i<Cars.size();i++){
        if(Cars.get(i) instanceof GasCar){
            calculatePrice(Cars.get(i).getId());
            ((GasCar)Cars.get(i)).gasConsumption();
        System.out.println(((GasCar)Cars.get(i)).toString());
        }
        }
     System.out.println("\n HIBRIDO: \n\n");
     for(int i=0;i<Cars.size();i++){
         if(Cars.get(i) instanceof HibridCar){
            calculatePrice(Cars.get(i).getId());
            ((HibridCar)Cars.get(i)).getConsumeBatery();
            ((HibridCar)Cars.get(i)).gasConsumption();
         System.out.println(((HibridCar)Cars.get(i)).toString());
         }
          }

          
          System.out.println("\n\n MOTOCICLETAS: \n\n");
          System.out.println("ESTANDAR : \n\n");
          for(int i=0;i<Cars.size();i++){
            if(Cars.get(i) instanceof Motorcicle){
                if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.STANDARD)){
                    calculatePrice(Cars.get(i).getId());
                    ((Motorcicle)Cars.get(i)).gasConsumption();
            System.out.println(((Motorcicle)Cars.get(i)).toString());
             }
            }
             }
            
             System.out.println("\nDEPORTIVO : \n\n");
             for(int i=0;i<Cars.size();i++){
               if(Cars.get(i) instanceof Motorcicle){
                   if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.SPORT)){
                    calculatePrice(Cars.get(i).getId());
                    ((Motorcicle)Cars.get(i)).gasConsumption();
               System.out.println(((Motorcicle)Cars.get(i)).toString());
                }
               }
                } 
                System.out.println("\nSCOOTER : \n\n");
                for(int i=0;i<Cars.size();i++){
                  if(Cars.get(i) instanceof Motorcicle){
                      if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.SCOOTER)){
                        calculatePrice(Cars.get(i).getId());
                        ((Motorcicle)Cars.get(i)).gasConsumption();
                  System.out.println(((Motorcicle)Cars.get(i)).toString());
                   }
                  }
                   } 
                   System.out.println("\nCROSS : \n\n");
                   for(int i=0;i<Cars.size();i++){
                     if(Cars.get(i) instanceof Motorcicle){
                         if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.CROSS)){
                            calculatePrice(Cars.get(i).getId());
                            ((Motorcicle)Cars.get(i)).gasConsumption();
                     System.out.println(((Motorcicle)Cars.get(i)).toString());
                      }
                     }
                      } 
}
public void ShowInfo(){

    System.out.println("VEHICULOS NUEVOS: \n\n\n");

    ShowVehicles();

    System.out.println("VEHICULOS USADOS: \n");

    ShowVehicles();

}









}
