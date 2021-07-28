package homework7.Task3;

import java.util.Random;

public class Progress implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(11) > 5;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла Progress запущены.\n" +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Progress");
    }
}
