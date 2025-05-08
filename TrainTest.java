
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TrainTest {

    // Engine Tests
    private Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
    FuelType f = FuelType.ELECTRIC;

    
    @Test
    public void testEngineConstructor() {
        assertEquals(f, myEngine.getFuelType());
    }

    @Test
    public void testEngineGo() {
        myEngine.go();
        assertEquals(9.0, myEngine.getCurrentFuel(), 0.0);
    }

    // Car Tests
    ArrayList<Passenger> passengerList = new ArrayList<>();
    private Car  myCar = new Car(10, 5, passengerList);
    Passenger p;

    @Test
    public void testCarAddPassenger() {
        myCar.addPassenger(p);
        assertEquals(4, myCar.seatsRemaining());
    }

    @Test
    public void testCarRemovePassenger() {
        myCar.removePassenger(p);
        assertEquals(5, myCar.seatsRemaining());
    }

    // Passenger Tests
    ArrayList<Car> carList = new ArrayList<>();
    private Passenger myPassenger = new Passenger("p", carList);
    Car c;
    @Test
    public void testPassengerBoardCarWithSpace() {
        carList.add(c);
        assertTrue(carList.contains(c));
    }

    @Test
    public void testPassengerBoardCarFull() {
        carList.add(c);
        assertFalse(carList.contains(c));
    }

    // Train Tests
    private Train myTrain = new Train(FuelType.ELECTRIC, 100);
    int nCars;
    int i;
    @Test
    public void testTrainConstructor() {
        assertEquals(10, nCars);
    }

    @Test
    public void testTrainPassengerCount() {
        myCar.addPassenger(myPassenger);
        assertTrue(passengerList.contains(myPassenger));
        myCar.removePassenger(myPassenger);
        assertFalse(passengerList.contains(myPassenger));

    }

    @Test
    public void testTrainGetCar() {
        assertEquals(carList.get(i), myTrain.getCar(i));
    }

    @Test
    public void testTrainPrintManifest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myTrain.printManifest();

        String expectedOutput = passengerList.toString();
        assertEquals(expectedOutput.trim(), outContent.toString().trim());

        System.setOut(System.out);
    }
    //Note: for testTrainPrintManifest I used AI to help me debug because I couldn't figure out how to use 
    //assertEquals when printManifest was void
}
