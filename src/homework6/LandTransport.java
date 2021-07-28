package homework6;

public class LandTransport extends Transport {
    private Integer countWheels;
    private Double fuel;

    public LandTransport(Double power,
                         Double maxSpeed,
                         Double weight,
                         Brand brands,
                         Integer countWheels,
                         Double fuel) {
        super(power, maxSpeed, weight, brands);
        this.countWheels = countWheels;
        this.fuel = fuel;
    }

    public Integer getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(Integer countWheels) {
        this.countWheels = countWheels;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("5. Count wheels: ").append(countWheels).append("\n");
        stringBuilder.append("6. Fuel: ").append(fuel).append("\n");
        return stringBuilder.toString();
    }
}
