class IgnitionSystem {
    public void drive(Car car){
        if (car.Start()==Car.E100){
            car.setRuningEngine(true);
        }else if (car.Start()==Car.E400){
            car.setRuningEngine(true);
        } else if (car.Start()==Car.E500) {
            car.setRuningEngine(true);
        }else car.setRuningEngine(false);
    }


}
