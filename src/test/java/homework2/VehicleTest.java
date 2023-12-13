package homework2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    @DisplayName("Test Car is an instance of Vehicle")
    void testInstanceOf(){
        Car car = new Car("Toyota", "Crown", 2022);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Test object of Car in driving mode (speed = 60)")
    void testDriveCar() {
        Car car = new Car("Toyota", "Crown", 2022);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    @Test
    @DisplayName("Test object of Car in parking mode (speed = 0)")
    void parkCar() {
        Car car = new Car("Toyota", "Crown", 2022);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    @Test
    @DisplayName("Test object of Car has 4 wheels")
    void getNumWheelsCar() {
        Car car = new Car("Toyota", "Crown", 2022);
        assertTrue(car.getNumWheels() == 4);
    }

    @Test
    @DisplayName("Test object of Motorcycle  has 2 wheels")
    void getNumWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki ", "Versys", 2021);
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    @Test
    @DisplayName("Test object of Motorcycle in driving mode (speed = 75)")
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki ", "Versys", 2021);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    @Test
    @DisplayName("Test object of Motorcycle in parking mode (speed = 0)")
    void parkMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki ", "Versys", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}