public class Car extends Vehicle implements Driveable {
    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("This car is getting faster and faster!");
    }

    @Override
    public void brake() {
        System.out.println("The car is stopping!");
    }

    @Override
    public void changeGear() {
        System.out.println("You are changing gears!");
    }
}
