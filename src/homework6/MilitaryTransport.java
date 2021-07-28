package homework6;

public class MilitaryTransport extends AirTransport {
    private boolean catapultaSystem;
    private Integer countWeapon;

    public MilitaryTransport(Double power,
                             Double maxSpeed,
                             Double weight,
                             Brand brands,
                             Double wingspan,
                             Double minWay,
                             boolean catapultaSystem,
                             Integer countWeapon) {
        super(power, maxSpeed, weight, brands, wingspan, minWay);
        this.catapultaSystem = catapultaSystem;
        this.countWeapon = countWeapon;
    }

    public boolean isCatapultaSystem() {
        return catapultaSystem;
    }

    public void setCatapultaSystem(boolean catapultaSystem) {
        this.catapultaSystem = catapultaSystem;
    }

    public Integer getCountWeapon() {
        return countWeapon;
    }

    public void setCountWeapon(Integer countWeapon) {
        this.countWeapon = countWeapon;
    }

    public void shot() {
        if (countWeapon > 0) {
            System.out.println("Ракета пошла...");
            countWeapon--;
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void isCatapulta() {
        if (catapultaSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("7. Catapulta system: ").append(catapultaSystem).append("\n");
        stringBuilder.append("8. Count weapon: ").append(countWeapon);
        return stringBuilder.toString();
    }
}
