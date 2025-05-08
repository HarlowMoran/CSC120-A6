import java.util.ArrayList;

public class Train implements TrainRequirements{

    //Attributes
    private ArrayList<Car> carList;
    private Engine engine;

    
    /**
     * creates a train object 
     * @param fuelType
     * @param fuelCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity){
        this.engine = new Engine(FuelType.ELECTRIC, 100, 100);
        this.carList = new ArrayList<Car>();
    }

    /**
     * returns the engine
     * @return Engine
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * returns the car at int i in the carList
     * @return carList.get(i)
     */
    public Car getCar(int i){
        
        return carList.get(i);
    }

    /**
     * returns the maximum capacity of the train across all cars
     * @return carList.size()*a
     */
    public int getMaxCapacity(){
        int a = 0;
        for(int i = 0; i < carList.size(); i++){
            a += carList.get(i).getCapacity();
        }
        return (carList.size() * a);
    }

    /**
     * returns the seats remaining across all cars
     * @return carList.size() * a
     */
    public int seatsRemaining(){
        int a = 0;
        for(int i = 0; i < carList.size(); i++){
            a += carList.get(i).seatsRemaining();
        }
        return (carList.size() * a);
    }

    /**
     * prints out a list of all the passengers aboard the train across all cars
     */
    public void printManifest(){
        for(int i = 0; i < carList.size(); i++){
            carList.get(i).printManifest();
        }
    }

}
