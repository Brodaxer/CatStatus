class IgnitionSystem {
    public boolean Start(Car car){
        if(!car.getFuelTank()){
            car.setRuningEngine(false);
            return Car.E300 ;                   // nie da sie uruchomic
        } else if (!car.isEffEngine()) {
            car.setRuningEngine(false);
            return Car.E200;                    // nie da sie uruchomic
        } else if (!car.isFuealFlap()) {
            car.setRuningEngine(true);
            return Car.E400;
        }else if (!car.isTrunkFlap()){
            car.setRuningEngine(true);
            return Car.E500;
        }else
            car.setRuningEngine(true);
            return Car.E100;
    }
    public String Status(Car car){
        if (!car.getFuelTank()){
            return "Sprawdz poziom paliwa";
        } else if (!car.isEffEngine()) {
            return "Check engine";
        } else if (!car.isFuealFlap()) {
            return "Sprawdz wlew paliwa";
        } else if (!car.isTrunkFlap()) {
            return "Sprawdz klape bagaznika";
        }else return "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";

    }
}