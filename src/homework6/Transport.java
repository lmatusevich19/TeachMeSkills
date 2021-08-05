package homework6;

public class Transport {
    private Double power;
    private Double maxSpeed;
    private Double weight;
    private Brand brands;

    public Transport(Double power, Double maxSpeed, Double weight, Brand brands) {
        super();
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brands = brands;
    }

    public Double convertPower() {
        if (power == null) {
            return null;
        }
        return power * 0.74;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Brand getBrands() {
        return brands;
    }

    public void setBrands(Brand brands) {
        this.brands = brands;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. Power: ").append(power).append("\n");
        stringBuilder.append("2. Max speed: ").append(maxSpeed).append("\n");
        stringBuilder.append("3. Weight: ").append(weight).append("\n");
        stringBuilder.append("4. Brand: ").append(brands).append("\n");
        return stringBuilder.toString();
    }
}
