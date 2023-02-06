public class CarApp {
    public static void main(String[] args) {
        Car maluch = new Car(true, true, true, true);
        IgnitionSystem ignite = new IgnitionSystem();

        System.out.println(ignite.Status(maluch));
        System.out.println(ignite.Start(maluch));
    }
}
