package Tasks.lesson11;

public class Car {
    String make;
    String model;
    public Car(String make, String model) {
        this.make=make;
        this.model= model;
    }
    @Override
    public String toString() {

        return "Make: " + make + " | " +
                " Model: " + model ;
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Mitsubishi", "Evo");
        Car car3 = new Car("Honda","Civic");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
