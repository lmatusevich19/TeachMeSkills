package homework6;

public class AirTransport extends Transport {
    public Double wingspan;
    private Double minWay;

    public AirTransport(Double power,
                        Double maxSpeed,
                        Double weight,
                        Brand brands,
                        Double wingspan,
                        Double minWay) {
        super(power, maxSpeed, weight, brands);
        this.wingspan = wingspan;
        this.minWay = minWay;
    }

    public Double getWingspan() {
        return wingspan;
    }

    public void setWingspan(Double wingspan) {
        this.wingspan = wingspan;
    }

    public Double getMinWay() {
        return minWay;
    }

    public void setMinWay(Double minWay) {
        this.minWay = minWay;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("5. Wingspan: ").append(wingspan).append("\n");
        stringBuilder.append("6. Min way: ").append(minWay).append("\n");
        return stringBuilder.toString();
    }
}
