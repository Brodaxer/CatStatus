class Car {
    private boolean fuelTank;
    private boolean effEngine;
    private boolean fuealFlap;
    private boolean trunkFlap;
    private boolean runingEngine;

    public static String E100 = "E100";
    public static String E200 = "E200";
    public static String E300 = "E300";
    public static String E400 = "E400";
    public static String E500 = "E500";

    public Car(boolean fuelTank, boolean effEngine, boolean fuealFlap, boolean trunkFlap) {
        this.fuelTank = fuelTank;
        this.effEngine = effEngine;
        this.fuealFlap = fuealFlap;
        this.trunkFlap = trunkFlap;

    }

//    public boolean getFuelTank() {
//        return fuelTank;
//    }

    public void setFuelTank(boolean fuelTank) {
        this.fuelTank = fuelTank;
    }

//    public boolean isEffEngine() {
//        return effEngine;
//    }

    public void setEffEngine(boolean effEngine) {
        this.effEngine = effEngine;
    }

//    public boolean isFuealFlap() {
//        return fuealFlap;
//    }

    public void setFuealFlap(boolean fuealFlap) {
        this.fuealFlap = fuealFlap;
    }

//    public boolean isTrunkFlap() {
//        return trunkFlap;
//    }

    public void setTrunkFlap(boolean trunkFlap) {
        this.trunkFlap = trunkFlap;
    }

    public boolean isRuningEngine() {
        return runingEngine;
    }

    public void setRuningEngine(boolean runingEngine) {
        this.runingEngine = runingEngine;
    }
    public String Start() {
        if (!fuelTank) {
            return Car.E300;                   // nie da sie uruchomic
        } else if (!effEngine) {
            return Car.E200;                    // nie da sie uruchomic
        } else if (!fuealFlap) {
            return Car.E400;
        } else if (!trunkFlap) {
            return Car.E500;
        } else return Car.E100;
    }
    public String Status() {
        if (!fuelTank) {
            return "Sprawdz poziom paliwa";
        } else if (!effEngine) {
            return "Check engine";
        } else if (!fuealFlap) {
            return "Sprawdz wlew paliwa";
        } else if (!trunkFlap) {
            return "Sprawdz klape bagaznika";
        } else return "Wszystkie systemy sprawne, mo??esz wyruszy?? w bezpieczn?? podr????";

    }
}


