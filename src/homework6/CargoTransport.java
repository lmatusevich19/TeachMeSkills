package homework6;

public class CargoTransport extends LandTransport {
    private Double lifting;

    public CargoTransport(Double power,
                          Double maxSpeed,
                          Double weight,
                          Brand brands,
                          Integer countWheels,
                          Double fuel,
                          Double lifting) {
        super(power, maxSpeed, weight, brands, countWheels, fuel);
        this.lifting = lifting;
    }

    public Double getLifting() {
        return lifting;
    }

    public void setLifting(Double lifting) {
        this.lifting = lifting;
    }

    public void liftingFull(Double lifting) {
        if (lifting <= this.lifting) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cargo transport:").append("\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("7. Lifting: ").append(lifting).append("\n");
        stringBuilder.append("8. Power K/B: ").append(super.convertPower());
        return stringBuilder.toString();
    }
}
