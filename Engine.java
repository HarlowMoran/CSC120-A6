public class Engine implements EngineRequirements {
    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;
    /**
     * creates an object engine
     * @param f
     * @param currentFuelLevel
     * @param maxFuelLevel
     */

    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;

    }
    
    
    public FuelType getFuelType() {
        return this.f;
    }
    
    public double getMaxFuel() {
        return 0.;
    }

    public double getCurrentFuel() {
        return 0.;
    }

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }
    
    public Boolean go() {
        currentFuelLevel = currentFuelLevel - 1.0;
        System.out.println(currentFuelLevel);
        if(currentFuelLevel > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        return("Engine has fuel type " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
    }

    /**
     * New instance of engine.
     * @param args
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        System.out.println(myEngine);

    }
}