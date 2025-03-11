import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    private ArrayList<Car> carList;
    private Engine engine;
    int nCars;
    int passengerCapacity;
    int seatsRemaining;
    private ArrayList<Passenger> passengerList;
    
    /**
     * creates a train object 
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(FuelType.ELECTRIC, 100, 100);
        this.carList = new ArrayList<Car>();
    }


    public Engine getEngine(){
        return engine;
    }
    public Car getCar(int i){
        
        return carList.get(i);
    }

    public int getMaxCapacity(){
        return (nCars * passengerCapacity);
    }

    public int seatsRemaining(){
        return (nCars * seatsRemaining);
    }

    public void printManifest(){
        System.out.println(passengerList);
    }

}
