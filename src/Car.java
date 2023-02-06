class Car {
    private boolean fuelTank;
    private boolean effEngine;
    private boolean fuealFlap;
    private boolean trunkFlap;
    private boolean runingEngine;

    public static boolean E100 ;//= "100 - samochod udalo sie uruchomic ";
    public static boolean E200 ;//= "200 - samochodu nie da się uruchomić z powodu awarii silnika";
    public static boolean E300 ;//= "300 - samochodu nie da się uruchomić z powodu braku paliwa";
    public static boolean E400 ;//= "400 - samochód udało się uruchomić, ale klapka wlewu paliwa nie jest zamknięta";
    public static boolean E500 ;//= "500 - samochód udało się uruchomić, ale drzwi lub bagażnik nie są zamknięte";

    public Car(boolean fuelTank, boolean effEngine, boolean fuealFlap, boolean trunkFlap) {
        this.fuelTank = fuelTank;
        this.effEngine = effEngine;
        this.fuealFlap = fuealFlap;
        this.trunkFlap = trunkFlap;

    }

    public boolean getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(boolean fuelTank) {
        this.fuelTank = fuelTank;
    }

    public boolean isEffEngine() {
        return effEngine;
    }

    public void setEffEngine(boolean effEngine) {
        this.effEngine = effEngine;
    }

    public boolean isFuealFlap() {
        return fuealFlap;
    }

    public void setFuealFlap(boolean fuealFlap) {
        this.fuealFlap = fuealFlap;
    }

    public boolean isTrunkFlap() {
        return trunkFlap;
    }

    public void setTrunkFlap(boolean trunkFlap) {
        this.trunkFlap = trunkFlap;
    }

    public boolean isRuningEngine() {
        return runingEngine;
    }

    public void setRuningEngine(boolean runingEngine) {
        this.runingEngine = runingEngine;
    }
}

