package enums;

public enum CapacityOfBus {
    SMALLEST(null, 10),
    SMALL(null, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    LARGEST(100, 120);

    private final Integer minCapacityOfBus;
    private final Integer maxCapacityOfBus;

    CapacityOfBus(Integer minCapacityOfBus, Integer maxCapacityOfBus) {
        this.minCapacityOfBus = minCapacityOfBus;
        this.maxCapacityOfBus = maxCapacityOfBus;
    }

    @Override
    public String toString() {
        if(minCapacityOfBus == null) {
            return "Вместимость: до: " + maxCapacityOfBus + " мест";
        } else if (maxCapacityOfBus == null) {
            return "Вместимость: от: " + minCapacityOfBus + " мест";
        } else {
            return "Вместимость: " + minCapacityOfBus + "-" + maxCapacityOfBus + " мест";
        }
    }
}
