package transport;

import enums.DriverLicense;
import enums.TonnageOfTruck;
import drivers.DriverC;
import exceptions.NotFoundDriverLicenseException;

public class Truck extends Transport<DriverC> {

    private DriverC driverC;
    private TonnageOfTruck tonnageOfTruck;

    private final DriverLicense driverLicense = DriverLicense.C;


    @Override
    public void startMovement() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    @Override
    public void endMovement() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 4 секунды");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 3 минуты 59 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 145 км/ч");
    }

    @Override
    public void info() {
        System.out.println("Водитель " + getDriverC().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }

    @Override
    public void printType() {
        if (tonnageOfTruck == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(tonnageOfTruck);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println(getBrand() + " " + getModel() + " прошел диагностику");
    }


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public DriverC getDriverC() { return driverC; }

    public void setDriverC(DriverC driverC) { this.driverC = driverC; }

    public TonnageOfTruck getTonnageOfTruck() {
        return tonnageOfTruck;
    }

    public void setTonnageOfTruck(TonnageOfTruck tonnageOfTruck) {
        this.tonnageOfTruck = tonnageOfTruck;
    }


    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }

    public void getThisDriverLicense() throws NotFoundDriverLicenseException {
        if (driverC.getDriverLicense() == null || driverC.getDriverLicense() != driverLicense){
            throw new NotFoundDriverLicenseException(
                    "У водителя не указан тип водительских прав или категория прав неверна");
        }
    }

    @Override
    public void checkDriverLicense() {
        try {
            getThisDriverLicense();
        } catch (NotFoundDriverLicenseException e) {
            e.printStackTrace();
        }
    }
}
