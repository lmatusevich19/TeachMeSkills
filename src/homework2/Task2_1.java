package homework2;

/**
 * Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
 * день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
 * суммарный путь пробежит спортсмен за 7 дней?
 */
public class Task2_1 {
    public static void main(String[] args) {
        double result = 10;
        double tmp = 10;
        for (int i = 0; i < 6; i++) {
            tmp = tmp + tmp * 0.1;
            result = result + tmp;
        }
        System.out.printf("%.2f", result);
    }
}
