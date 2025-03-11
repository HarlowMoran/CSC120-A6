import java.util.ArrayList;

public class Car implements CarRequirements{
    //Atributes
    private int capacity;
    private int seatsRemaining;
    private ArrayList<Passenger> passengerList;

/**
 * Creates the car object.
 * @param capacity
 * @param seatsRemaining
 * @param passengerList
 */
    public Car(int capacity, int seatsRemaining, ArrayList<Passenger> passengerList){
        this.capacity = capacity;
        this.seatsRemaining = seatsRemaining;
        this.passengerList = new ArrayList<>(passengerList);

    }
    /**
     * returns the capacity
     */
    public int getCapacity() {
        return this.capacity;
    }
    /**
     * returns the seats remaining
     */
    public int seatsRemaining() {
        return this.seatsRemaining;
    }
    /**
     * Adds a passenger to the car
     */
    public Boolean addPassenger(Passenger p) {
        if(passengerList.contains(p)){
            return false;
        } 
        else if (seatsRemaining > 0){
            passengerList.add(p);
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * removes a passenger from the car
     */
    public Boolean removePassenger(Passenger p) {
        if(passengerList.contains(p)){
            passengerList.remove(p);
            return true;
        }
        else {
            return false;
        }
    }

    public void printManifest(){
        System.out.println("Car has capacity: " + this.capacity + " seats remaining: " + this.seatsRemaining);
    }


}