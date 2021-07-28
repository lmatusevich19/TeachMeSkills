package homework7.Task1.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    @Override
    public void step() {
        System.out.println("Шаг Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
