package drivers;

import enums.DriverLicense;

public class DriverCar {

    protected void startMovement(){
        System.out.println("Водитель " + getFullName() + " начал движение");
    };

    protected void stopMovement() {
        System.out.println("Водитель " + getFullName() + " остановился");
    };

    protected void refuel(){
        System.out.println("Водитель " + getFullName() + " поехал на заправку");
    };


    protected final String fullName;
    protected boolean availabilityDriverLicense;
    protected int experience;
    protected DriverLicense driverLicense;


    public DriverCar(String fullName, Boolean driverLicense, int experience) {

        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Водитель";
        } else {
            this.fullName = fullName;
        }

        if (driverLicense == null) {
            this.availabilityDriverLicense = false;
        } else {
            this.availabilityDriverLicense = driverLicense;
        }

        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public String getFullName() { return fullName; }

    public boolean getAvailabilityDriverLicense() { return availabilityDriverLicense; }

    public int getExperience() { return experience; }

    public void setAvailabilityDriverLicense(Boolean availabilityDriverLicense) {
        if (availabilityDriverLicense == null) {
            this.availabilityDriverLicense = false;
        } else {
            this.availabilityDriverLicense = availabilityDriverLicense;
        }
    }

    public void setExperience (int experience){
        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }


    public void setDriverLicense(DriverLicense driverLicense) {
        if (driverLicense == null) {
            this.driverLicense = null;
            setAvailabilityDriverLicense(false);
        } else {
            this.driverLicense = driverLicense;
            setAvailabilityDriverLicense(true);
        }
    }



    @Override
    public String toString() {
        return "Водитель - " + fullName +
                ", наличие прав - " + availabilityDriverLicense +
                ", стаж - " + experience + " лет";
    }
}
