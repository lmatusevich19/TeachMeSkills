package homework7.Task1;

import homework7.Task1.hands.SamsungHand;
import homework7.Task1.hands.SonyHand;
import homework7.Task1.hands.ToshibaHand;
import homework7.Task1.heads.SamsungHead;
import homework7.Task1.heads.SonyHead;
import homework7.Task1.heads.ToshibaHead;
import homework7.Task1.legs.SamsungLeg;
import homework7.Task1.legs.SonyLeg;
import homework7.Task1.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
 * Класс SonyHead является примером реализацией головы от Sony.
 * Создайте 3 робота с разными комплектующими.
 * Например у робота голова и нога от Sony а, рука от Samsung.
 * У всех роботов вызовите метод action.
 * Среди 3-х роботов найдите самого дорогого.
 */
public class Run {
    public static void main(String[] args) {
        Robot robotOne = new Robot(new SamsungHead(12), new SonyHand(10), new ToshibaLeg(15));
        Robot robotTwo = new Robot(new SonyHead(100), new ToshibaHand(30), new SonyLeg(25));
        Robot robotThree = new Robot(new ToshibaHead(50), new SamsungHand(50), new SamsungLeg(10));

        List<Robot> robots = new ArrayList<>();
        robots.add(robotOne);
        robots.add(robotTwo);
        robots.add(robotThree);
        int maxPrice = 0;
        String nameRobot = null;
        for (Robot robot : robots) {
            robot.action();
            if (robot.getPrice() > maxPrice) {
                maxPrice = robot.getPrice();
                System.out.println("----------------------------------------------");
                nameRobot = robot.toString();
            }
        }
        System.out.println("Самый дорогой робот - " + nameRobot + ", стоимостью - " + maxPrice);
    }
}
