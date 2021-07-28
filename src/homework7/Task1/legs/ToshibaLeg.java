package homework7.Task1.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Шаг Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
