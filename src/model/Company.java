package model;

import java.nio.file.LinkOption;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;

	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }
	

    public void registerBattery(String name, double voltage, double cost, double capacity){
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new Battery(name, voltage, cost, capacity);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type1) {
        int emtyPos = getEmtyPosition();

        Type type = Type.LITIO;

        switch(type1) {

            case 1:
                type = Type.LITIO;
                break;
            case 2:
                type = Type.NIQUEL_CADIO;
        }

        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,type);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public String showTotalBatteries() {
    	return "";
    }
    
    public String showBatteriesInfo() {
    	String str = "";
    	return str;
    }
    

	public double calculateUsefulPromLifeCost(){
		return 0.0;
	}

}
