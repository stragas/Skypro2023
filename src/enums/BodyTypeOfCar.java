package enums;

public enum BodyTypeOfCar {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyTypeOfCar;

    BodyTypeOfCar(String bodyTypeOfCar) {
        this.bodyTypeOfCar = bodyTypeOfCar;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyTypeOfCar;
    }
}

