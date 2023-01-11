package transport;

import enums.BodyTypeOfCar;
import drivers.DriverB;
import enums.DriverLicense;
import exceptions.NotFoundDriverLicenseException;

public class PassengerCar extends Transport<DriverB>{

    private DriverB driverB;

    private BodyTypeOfCar bodyTypeOfCar;
    private final DriverLicense driverLicense = DriverLicense.B;



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
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 5 секунд");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 2 минуты 7 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 180 км/ч");
    }

    @Override
    public void info() {
        System.out.println("Водитель " + getDriverB().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }

    @Override
    public void printType() {
        if (bodyTypeOfCar == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        else {
            System.out.println(bodyTypeOfCar);
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println(getBrand() + " " + getModel() + " прошел диагностику");
    }


    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public DriverB getDriverB() { return driverB; }

    public void setDriverB(DriverB driverB) { this.driverB = driverB; }

    public BodyTypeOfCar getBodyTypeOfCar() {
        return bodyTypeOfCar;
    }

    public void setBodyTypeOfCar(BodyTypeOfCar bodyTypeOfCar) {
        this.bodyTypeOfCar = bodyTypeOfCar;
    }


    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }

    public void getThisDriverLicense() throws NotFoundDriverLicenseException {
        if (driverB.getDriverLicense() == null || driverB.getDriverLicense() != driverLicense){
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

