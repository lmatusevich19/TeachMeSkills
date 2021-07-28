package homework7.Task3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrom launchOne = new Cosmodrom();
        Cosmodrom launchTwo = new Cosmodrom();
        Cosmodrom launchThree = new Cosmodrom();

        launchOne.launch(new SpaceX());
        System.out.println("----------------------------------------");
        launchTwo.launch(new Progress());
        System.out.println("----------------------------------------");
        launchThree.launch(new Appolon());
    }
}
