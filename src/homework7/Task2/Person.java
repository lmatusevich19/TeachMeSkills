package homework7.Task2;

import homework7.Task2.jacket.Jacket;
import homework7.Task2.shoes.Shoes;
import homework7.Task2.trousers.Trousers;

public class Person implements Personable {
    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Person(String name, Jacket jacket, Shoes shoes, Trousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    @Override
    public void dressed() {
        jacket.upJacket();
        shoes.upShoes();
        trousers.upTrousers();
    }

    @Override
    public void undress() {
        jacket.downJacket();
        shoes.downShoes();
        trousers.downTrousers();
    }
}
