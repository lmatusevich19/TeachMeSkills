package homework5;

public class Computer {
    private String processor;
    private String RAM;
    private String HDD;
    private int resource;

    public Computer() {
    }

    public Computer(String processor, String RAM, String HDD, int resource) {
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = resource;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", resource=" + resource +
                '}';
    }

    public boolean onComputer(int inputRandom, int inputUser) {
        if (inputRandom == inputUser) { //если рандомное число равно введенному с клавиатуры
            System.out.println("Computer in fire!!!"); //то выводим на экран компьютер сгорел
            resource = 0; //и устанавливаем значение кол-во циклов работы 0 , т.е. компбьютер больше не работает
            return false;
        }
        resource--;
        return true;
    }

    public boolean offComputer(int inputRandom, int inputUser) {
        if (inputRandom == inputUser) {  //если рандомное число равно введенному с клавиатуры
            System.out.println("Computer in fire!!!"); //то выводим на экран компьютер сгорел
            resource = 0; //и устанавливаем значение кол-во циклов работы 0 , т.е. компбьютер больше не работает
            return false;
        }
        return true;
    }
}