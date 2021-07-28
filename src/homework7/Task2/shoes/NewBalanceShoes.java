package homework7.Task2.shoes;

public class NewBalanceShoes implements Shoes{
    @Override
    public void upShoes() {
        System.out.println("Обуть New Balance");
    }

    @Override
    public void downShoes() {
        System.out.println("Разуться New Balance");
    }
}
