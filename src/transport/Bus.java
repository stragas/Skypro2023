package transport;

import enums.CapacityOfBus;
import drivers.DriverD;
import enums.DriverLicense;
import exceptions.DiagnosticsNotPassedException;
import exceptions.NotFoundDriverLicenseException;

public class Bus extends Transport<DriverD> {

    private DriverD driverD;

    private CapacityOfBus capacityOfBus;

    private final DriverLicense driverLicense = DriverLicense.D;


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
        System.out.println(getBrand() + " " + getModel() + " пробыл на пит-стопе 14 секунд");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " - 4 минуты 13 секунд");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " - 110 км/ч");
    }
    @Override
    public void info() {
        System.out.println("Водитель " + getDriverD().getFullName() +
                " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участовать в заезде");
    }

    @Override
    public void printType() {
        if(capacityOfBus == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacityOfBus);
        }
    }

    @Override
    public void passDiagnostics() {
        Exception e = new DiagnosticsNotPassedException("Автобусы не могут пройти диагностику");
        System.out.println(e.getMessage());
    }


    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public DriverD getDriverD() { return driverD; }

    public void setDriverD(DriverD driverD) { this.driverD = driverD; }

    public CapacityOfBus getCapacityOfBus() {
        return capacityOfBus;
    }

    public void setCapacityOfBus(CapacityOfBus capacityOfBus) {
        this.capacityOfBus = capacityOfBus;
    }



    @Override
    public String toString() {
        return brand + " " +
                model + ", " +
                engineVolume + " л.";

    }

    public void getThisDriverLicense() throws NotFoundDriverLicenseException {
        if (driverD.getDriverLicense() == null || driverD.getDriverLicense() != driverLicense){
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

