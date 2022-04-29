package model;

public class RechargeableBattery extends Battery {

    private int chargerNumber;

    public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber) {
        super(name, voltage, cost, capacity);
        this.chargerNumber = chargerNumber;
    }

    public int getChargerNumber() {
        return chargerNumber;
    }

    public void setChargerNumber(int chargerNumber) {
        this.chargerNumber = chargerNumber;
    }

    @Override
    public String toString() {
        return "chargerNumber=" + chargerNumber;
    }

    


}