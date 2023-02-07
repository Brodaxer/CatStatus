public class CarApp {
    public static void main(String[] args) {
        Car maluch = new Car(true, true, false, true);
        IgnitionSystem ignite = new IgnitionSystem();
//        public static boolean E100 ;//= "100 - samochod udalo sie uruchomic ";
//        public static boolean E200 ;//= "200 - samochodu nie da się uruchomić z powodu awarii silnika";
//        public static boolean E300 ;//= "300 - samochodu nie da się uruchomić z powodu braku paliwa";
//        public static boolean E400 ;//= "400 - samochód udało się uruchomić, ale klapka wlewu paliwa nie jest zamknięta";
//        public static boolean E500 ;//= "500 - samochód udało się uruchomić, ale drzwi lub bagażnik nie są zamknięte";

        if (ignite.Start(maluch)==Car.E100){
            maluch.setRuningEngine(true);
        }else if (ignite.Start(maluch)==Car.E400){
            maluch.setRuningEngine(true);
        } else if (ignite.Start(maluch)==Car.E500) {
            maluch.setRuningEngine(true);
        }else maluch.setRuningEngine(false);


        System.out.println(ignite.Start(maluch));
        System.out.println(maluch.isRuningEngine());


    }
}
