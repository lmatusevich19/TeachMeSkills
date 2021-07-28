package homework7.Task3;

import java.util.concurrent.TimeUnit;

public class Cosmodrom {
    public void launch(IStart iStart) throws InterruptedException {
        if (iStart.checkSystem()) {
            iStart.startEngine();
            countDown();
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

    private void countDown() throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
