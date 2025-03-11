import java.util.ArrayList;

public class Passenger implements PassengerRequirements{


 //Attributes
 private String name;
 private ArrayList<Car> carList;

 /**
  * Creates a passenger object.
  * @param name
  * @param carList
  */

 public Passenger(String name, ArrayList<Car> carList){
     this.name = name;
     this.carList = carList;
 }
    

    public void boardCar(Car c) {
        if(carList.contains(c)){
            System.out.println("Passenger already on car.");
        }
        else{
            c.addPassenger(this);
        }
       
    }

    public void getOffCar(Car c) {
        if(carList.contains(c)){
            c.removePassenger(this);
        }
        else{
            System.out.println("Passenger was not on car.");
        }
       
    }

}
