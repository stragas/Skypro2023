package enums;

public enum TonnageOfTruck {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float minTonnageOfTruck;
    private final Float maxTonnageOfTruck;

    TonnageOfTruck(Float minTonnageOfTruck, Float maxTonnageOfTruck) {
        this.minTonnageOfTruck = minTonnageOfTruck;
        this.maxTonnageOfTruck = maxTonnageOfTruck;
    }

    @Override
    public String toString() {
        if(minTonnageOfTruck == null) {
            return "Грузоподъемность до: " + maxTonnageOfTruck + " тонн";
        } else if (maxTonnageOfTruck == null) {
            return "Грузоподъемность от: " + minTonnageOfTruck + " тонн";
        } else {
            return "Грузоподъемность от: " + minTonnageOfTruck +
                    " тонн до: " + maxTonnageOfTruck + " тонн";
        }
    }
}
