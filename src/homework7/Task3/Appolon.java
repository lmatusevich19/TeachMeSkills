package homework7.Task3;

import java.util.Random;

public class Appolon implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(11) > 8;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла Appolon запущены.\n" +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Appolon");
    }
}
