package homework6;

import java.text.DecimalFormat;

public class EasyTransport extends LandTransport {
    private BodyCar bodyCar;
    private Integer countPassengers;

    public EasyTransport(Double power,
                         Double maxSpeed,
                         Double weight,
                         Brand brands,
                         Integer countWheels,
                         Double fuel,
                         BodyCar bodyCar,
                         Integer countPassengers) {
        super(power, maxSpeed, weight, brands, countWheels, fuel);
        this.bodyCar = bodyCar;
        this.countPassengers = countPassengers;
    }

    public BodyCar getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(BodyCar bodyCar) {
        this.bodyCar = bodyCar;
    }

    public Integer getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(Integer countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void way(Double hours) {
        Double maxSpeed = super.getMaxSpeed();
        Double fuel = super.getFuel();
        if (maxSpeed != null && fuel != null) {
            Double way = hours * maxSpeed;
            System.out.println("За время " + hours + " ч, автомобиль " + super.getBrands() +
                    " двигаясь  с максимальной скоростью " + maxSpeed + " км/ч " +
                    " проедет " + way + " км и израсходует " +
                    new DecimalFormat("#0.00").format(getCountFuel(fuel, way)) + " литров топлива."
            );
        }
    }

    private double getCountFuel(Double fuel, Double way) {
        return way / 100 * fuel;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Easy transport:").append("\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("7. Body car: ").append(bodyCar).append("\n");
        stringBuilder.append("8. Count Passengers: ").append(countPassengers).append("\n");
        stringBuilder.append("9. Power K/B: ").append(super.convertPower());
        return stringBuilder.toString();
    }
}
