package model;
import java.util.ArrayList;

public class Counselor{
/**
 * Array list that contain the registed vehicles
 */
    private ArrayList<Vehicle> Cars;

    /**
     * the matrix of the parking of the old cars
     */
	private Vehicle[][] parking;



/**
 * constructor of the class 
 */
    public Counselor() {

Cars= new ArrayList<Vehicle>();
parking= new Vehicle[10][5];
    



    }



/**
 * method to create and  add a electric car to the arraylist of vehicles
 * @param basePrice
 * @param brand
 * @param model
 * @param displacement
 * @param kilometers
 * @param plate
 * @param soat
 * @param price
 * @param year
 * @param cover
 * @param tecno
 * @param priceT
 * @param yearT
 * @param levelGasT
 * @param numberDoors
 * @param polarizedWindows
 * @param typeAutomobile
 * @param typeCharger
 * @param bateryDuration
 * @param typeVehicle
 * @return a message confirming that the vehicle has been successfully registered
 */
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

parkingSelection(model, electricCar);

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
/**
 * method to create and add a hibrid car in the arraylist of vehicles
 * @param basePrice
 * @param brand
 * @param model
 * @param displacement
 * @param kilometers
 * @param plate
 * @param soat
 * @param price
 * @param year
 * @param cover
 * @param tecno
 * @param priceT
 * @param yearT
 * @param levelGasT
 * @param numberDoors
 * @param polarizedWindows
 * @param typeAutomobile
 * @param tankCapacity
 * @param typeGas
 * @param typeCharger
 * @param bateryDuration
 * @param typeVehicle
 * @return a message confirming that the vehicle has been successfully registered
 */
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

parkingSelection(model, hibridCAr);

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
/**
 * method to create and add a gas car in the arraylist of vehicles
 * @param basePrice
 * @param brand
 * @param model
 * @param displacement
 * @param kilometers
 * @param plate
 * @param soat
 * @param price
 * @param year
 * @param cover
 * @param tecno
 * @param priceT
 * @param yearT
 * @param levelGasT
 * @param numberDoors
 * @param polarizedWindows
 * @param typeAutomobile
 * @param tankCapacity
 * @param typeGas
 * @param typeVehicle
 * @return a message confirming that the vehicle has been successfully registered
 */
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

parkingSelection(model, gasCar);

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
/**
 * method to create and add a motorcicle in the arraylist of vehicles
 * @param basePrice
 * @param brand
 * @param model
 * @param displacement
 * @param kilometers
 * @param plate
 * @param soat
 * @param price
 * @param year
 * @param cover
 * @param tecno
 * @param priceT
 * @param yearT
 * @param levelGasT
 * @param typeMotorcicle
 * @param gasCapacity
 * @param typeGas
 * @param typeVehicle
 * @return a message confirming that the vehicle has been successfully registered
 */
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

parkingSelection(model, motorcicle);

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

/**
 * method to calculate the total price of a vehicle using an id
 * @param id
 * @return a message with the price
 */
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
/**
 * method to show all the information of the vehicles registered
 */
public void ShowVehicles(){

    for(int i=0;i<Cars.size();i++){
    
      

    if(Cars.get(i) instanceof ElectricCar ){

        System.out.println("Tipo de vehiculo: Automobil electrico");
        System.out.println("tipo de combustible: Electrico" + "\n"
         + "Tipo de cargador: "+ ((ElectricCar)Cars.get(i)).getTypeCharger());
         System.out.println("Auto: "+Cars.get(i).getTypevehicle());
        calculatePrice(Cars.get(i).getId());
    ((ElectricCar)Cars.get(i)).getConsumeBatery();
    System.out.println(((ElectricCar)Cars.get(i)).toString());
    }

        if(Cars.get(i) instanceof GasCar){

            System.out.println("Tipo de vehiculo: Automobil de gasolina");
            System.out.println("tipo de combustible:" + ((GasCar)Cars.get(i)).getTypeGas());
             System.out.println("Auto: "+Cars.get(i).getTypevehicle());
            calculatePrice(Cars.get(i).getId());
            ((GasCar)Cars.get(i)).gasConsumption();
        System.out.println(((GasCar)Cars.get(i)).toString());
        }
        
    
    
         if(Cars.get(i) instanceof HibridCar ){

            System.out.println("Tipo de vehiculo: Automobil Hibrido");
            System.out.println("tipo de combustible:" + ((HibridCar)Cars.get(i)).getTypeGas());
            System.out.println("tipo de combustible: Electrico" + "\n"
            + "Tipo de cargador: "+ ((HibridCar)Cars.get(i)).getTypeCharger());
             System.out.println("Auto: "+Cars.get(i).getTypevehicle());
            calculatePrice(Cars.get(i).getId());
            ((HibridCar)Cars.get(i)).getConsumeBatery();
            ((HibridCar)Cars.get(i)).gasConsumption();
         System.out.println(((HibridCar)Cars.get(i)).toString());
         }
          

          
         
          
            if(Cars.get(i) instanceof Motorcicle){
                if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.STANDARD) ){

                    System.out.println("Tipo de vehiculo: Motocicleta Standard");
                    System.out.println("tipo de combustible:" + ((Motorcicle)Cars.get(i)).getTypeGas());
                     System.out.println("Auto: "+Cars.get(i).getTypevehicle());
                    calculatePrice(Cars.get(i).getId());
                    ((Motorcicle)Cars.get(i)).gasConsumption();
            System.out.println(((Motorcicle)Cars.get(i)).toString());
             }
            }
             
            
            
            
               if(Cars.get(i) instanceof Motorcicle ){
                   if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.SPORT)){
                    System.out.println("Tipo de vehiculo: Motocicleta Deportiva");
                    System.out.println("tipo de combustible:" + ((Motorcicle)Cars.get(i)).getTypeGas());
                     System.out.println("Auto: "+Cars.get(i).getTypevehicle());
                    calculatePrice(Cars.get(i).getId());
                    ((Motorcicle)Cars.get(i)).gasConsumption();
               System.out.println(((Motorcicle)Cars.get(i)).toString());
                }
               }
                
             
               
                  if(Cars.get(i) instanceof Motorcicle ){
                      if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.SCOOTER)){
                        System.out.println("Tipo de vehiculo: Motocicleta Scooter");
                        System.out.println("tipo de combustible:" + ((Motorcicle)Cars.get(i)).getTypeGas());
                         System.out.println("Auto: "+Cars.get(i).getTypevehicle());
                        calculatePrice(Cars.get(i).getId());
                        ((Motorcicle)Cars.get(i)).gasConsumption();
                  System.out.println(((Motorcicle)Cars.get(i)).toString());
                   }
                  }
                   

                  
                     if(Cars.get(i) instanceof Motorcicle){
                         if(((Motorcicle)Cars.get(i)).getTypeMotorcicle().equals(TypeM.CROSS)){
                            System.out.println("Tipo de vehiculo: Motocicleta Cross");
                            System.out.println("tipo de combustible:" + ((Motorcicle)Cars.get(i)).getTypeGas());
                             System.out.println("Auto: "+Cars.get(i).getTypevehicle());
                            calculatePrice(Cars.get(i).getId());
                            ((Motorcicle)Cars.get(i)).gasConsumption();
                     System.out.println(((Motorcicle)Cars.get(i)).toString());
                      }
                     }
                      



                    }
}

/**
 * method that show the documents of a determinate vehicle using their id
 * @param id
 * @return a message with the information of the documents
 */
public String ShowDocuments(String id){
String answer="";

for(int i=0;i<Cars.size();i++){


if(Cars.get(i).getId().equals(id)){

answer= Cars.get(i).documents();
break;
}else
answer="disculpe no se encontro el vehiculo que ingreso";


}


return answer;


}

/**
 * method that, depending on the model of a vehicle, adds it to the parking lot in a specific column. 
 * @param model
 * @param vehicle
 */
public void parkingSelection(int model, Vehicle vehicle){


if(vehicle.getTypevehicle()==TypeV.OLD){

if(model<2015){

switch(model){

case 2014:

for(int i=0;i<parking.length;i++){

if (parking[i][0]==null){
parking[i][0]=vehicle;
break;
}

}

break;

case 2013:

for(int i=0;i<parking.length;i++){

    if (parking[i][1]==null){
    parking[i][1]=vehicle;
    break;
    }
    
    }
    
    break;


case 2012: 


for(int i=0;i<parking.length;i++){

    if (parking[i][2]==null){
    parking[i][2]=vehicle;
    break;
    }
    
    }
    
    break;

case 2011:

for(int i=0;i<parking.length;i++){

    if (parking[i][3]==null){
    parking[i][3]=vehicle;
    break;
    }
    
    }
    
    break;

    
        


}

if(model<2011){
for(int i=0;i<parking.length;i++){

    if (parking[i][4]==null){
    parking[i][4]=vehicle;
    break;
    }
    
    }
    
}


}


}

}


/**
 * method that print the parking
 */
public String printParking(){


String out="            MAPA PARQUEADERO "+"\n\n";


  out+="|    2014     |     2013    |    2012     |    2011     |    2010>    | "+ "\n" + "**********************************************************************"+"\n";

for(int i=0;i<parking.length;i++){


for(int x=0;x<parking[0].length;x++){


if(parking[i][x]==null){

out+="*   (empty)  *";

} else
out+="* (occupied) *";



}


out+="\n"+"**********************************************************************"+"\n";



}





 return out;
}








/**
 * method that depending on the choice of the person shows the information of the vehicles in a column
 * @param option
 * @return message with the information
 */
public String generateInfo(int option){

    String out="";
option=option-1;

for(int x=0;x<parking.length;x++){

if(parking[x][option]!=null){

if(parking[x][option] instanceof GasCar){
out+=((GasCar) parking[x][option]).toString()+"\n\n";
} else if(parking[x][option] instanceof ElectricCar){
    out+=((ElectricCar) parking[x][option]).toString()+"\n\n";
}else if(parking[x][option] instanceof HibridCar){
    out+=((HibridCar) parking[x][option]).toString()+"\n\n";
}else if(parking[x][option] instanceof Motorcicle){
    out+=((Motorcicle) parking[x][option]).toString()+"\n\n";
}


}



}



return out;


}
/**
 * method of displaying the oldest and most recent vehicle information
 * @return a message with the information
 */
public String oldNewInfo(){

    String out="";
    int xold=0;
    int yold=0;
    int xnew=0;
    int ynew=0;
    int  Old=2016;//cannot be initialized to 0 since no model is less than 0
    int  New=0;

for(int x=0;x<parking.length;x++){

for(int y=0;y<parking[0].length;y++){

if(parking[x][y]!=null){

if(parking[x][y].getModel()>New){

   New= parking[x][y].getModel();
   xnew=x;
   ynew=y;
}

if(parking[x][y].getModel()<Old){

    Old= parking[x][y].getModel();
    xold=x;
    yold=y;
 }

}


}


}

out= " \n\n Informacion del vehiculo mas reciente: "+"\n\n";

if(New!=0){

if(parking[xnew][ynew] instanceof GasCar){
    out+=((GasCar)parking[xnew][ynew]).toString()+"\n\n";
    } else if(parking[xnew][ynew] instanceof ElectricCar){
        out+=((ElectricCar) parking[xnew][ynew]).toString()+"\n\n";
    }else if(parking[xnew][ynew] instanceof HibridCar){
        out+=((HibridCar) parking[xnew][ynew]).toString()+"\n\n";
    }else if(parking[xnew][ynew] instanceof Motorcicle){
        out+=((Motorcicle)parking[xnew][ynew]).toString()+"\n\n";
    }

}else
out+=" No Hay autos en el parqueadero\n\n";

out+=" Informacion del vehiculo mas antiguo: "+"\n\n";

if(Old!=0){
if(parking[xold][yold] instanceof GasCar){
    out+=((GasCar) parking[xold][yold]).toString()+"\n\n";
    } else if(parking[xold][yold] instanceof ElectricCar){
        out+=((ElectricCar) parking[xold][yold]).toString()+"\n\n";
    }else if(parking[xold][yold] instanceof HibridCar){
        out+=((HibridCar)parking[xold][yold]).toString()+"\n\n";
    }else if(parking[xold][yold] instanceof Motorcicle){
        out+=((Motorcicle)parking[xold][yold]).toString()+"\n\n";
    }

}else 
out+=" No Hay autos en el parqueadero\n\n";

    return out;

}
/**
 * method showing the parking lot occupancy percentage
 */
public String percentageParking(){

    int number=0;

    for(int x=0;x<parking.length;x++){

        for(int y=0;y<parking[0].length;y++){

       if(parking[x][y]!=null){

       number++;
       }

        }



    }

int answer= (number*100)/50;

String out=" El Porcentaje de ocupacion del parqueadero es del "+ answer+"%\n\n";
if(answer==100){

out+="El parqueadero necesita ser ampliado\n\n ";

}

return out;
}



}
