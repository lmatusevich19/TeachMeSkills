package homework6;

public class CivilTransport extends AirTransport {
    private Integer countPassengers;
    private boolean vip;

    public CivilTransport(Double power,
                          Double maxSpeed,
                          Double weight,
                          Brand brands,
                          Double wingspan,
                          Double minWay,
                          Integer countPassengers,
                          boolean vip) {
        super(power, maxSpeed, weight, brands, wingspan, minWay);
        this.countPassengers = countPassengers;
        this.vip = vip;
    }

    public Integer getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void countPassengersFull(Integer countPassengers) {
        if (countPassengers <= this.countPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам требуется самолет побольше");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Civil transport:").append("\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("7. Count passengers: ").append(countPassengers).append("\n");
        stringBuilder.append("8. VIP: ").append(vip).append("\n");
        stringBuilder.append("9. Power K/B: ").append(super.convertPower());
        return stringBuilder.toString();
    }
}
