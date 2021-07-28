package homework7.Task2;

import homework7.Task2.jacket.AlaskaJacket;
import homework7.Task2.jacket.ZaraJacket;
import homework7.Task2.shoes.ArmaniShoes;
import homework7.Task2.shoes.NewBalanceShoes;
import homework7.Task2.trousers.LevisTrousers;
import homework7.Task2.trousers.VersacheTrousers;

public class Run {
    public static void main(String[] args) {
        Person personOne = new Person("Elena", new AlaskaJacket(), new ArmaniShoes(), new LevisTrousers());
        Person personTwo = new Person("Denis", new ZaraJacket(), new NewBalanceShoes(), new VersacheTrousers());

        personOne.dressed();
        personOne.undress();
        System.out.println("----------------------------------");
        personTwo.dressed();
        personTwo.undress();
    }
}
