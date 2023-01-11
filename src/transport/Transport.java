package transport;

public abstract class Transport<T> implements Competing {

    abstract void startMovement();

    abstract void endMovement();

    abstract void info();

    abstract void printType();

    abstract void passDiagnostics();

    abstract void checkDriverLicense();

    protected final String brand;
    protected final String model;
    protected double engineVolume;
    protected T driver;


    public Transport(String brand, String model, double engineVolume) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriverCar() {
        return driver;
    }
}
