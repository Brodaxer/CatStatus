public class CarApp {
    public static void main(String[] args) {
        Car maluch = new Car(true, true, true, true);
        IgnitionSystem ignite = new IgnitionSystem();
//        public static boolean E100 ;//= "100 - samochod udalo sie uruchomic ";
//        public static boolean E200 ;//= "200 - samochodu nie da się uruchomić z powodu awarii silnika";
//        public static boolean E300 ;//= "300 - samochodu nie da się uruchomić z powodu braku paliwa";
//        public static boolean E400 ;//= "400 - samochód udało się uruchomić, ale klapka wlewu paliwa nie jest zamknięta";
//        public static boolean E500 ;//= "500 - samochód udało się uruchomić, ale drzwi lub bagażnik nie są zamknięte";
        ignite.drive(maluch);
        System.out.println(maluch.Start());

        System.out.println(maluch.Status());
        System.out.println(maluch.isRuningEngine());
        maluch.setFuealFlap(false);
        ignite.drive(maluch);
        System.out.println(maluch.Status());
        System.out.println(maluch.isRuningEngine());
        maluch.setEffEngine(false);
        ignite.drive(maluch);
        System.out.println(maluch.Status());
        System.out.println(maluch.isRuningEngine());
    }
}
