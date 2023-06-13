public abstract class Vehicle {
    private int speed;
    private float weight;

    Car car;
    Plane plane;
    FlyingCar flyingCar;

    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public FlyingCar getFlyingCar() {
        return flyingCar;
    }

    public void setFlyingCar(FlyingCar flyingCar) {
        this.flyingCar = flyingCar;
    }

    public void startEngine() {
        System.out.println("You are starting your vehicle.");
    }

    public void turnOffEngine() {
        System.out.println("You are turning the engine off.");
    }
}

