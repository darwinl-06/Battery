package model;

public class RechargeableBattery extends Battery {

    private int chargerNumber;
    private Type type;

    public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, Type type) {
        super(name, voltage, cost, capacity);
        this.chargerNumber = chargerNumber;
        this.type = type;
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