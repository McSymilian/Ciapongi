package org.oxford.ciapongi.trains;

import org.oxford.ciapongi.locomotiv.Locomotiv;
import org.oxford.ciapongi.wagony.RailroadCar;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final int id;
    private Locomotiv locomotiv;

    private final List<RailroadCar> railroadCars = new ArrayList<>();

    private int x;
    private int y;


    public Train(int id) {
        this.id = id;
    }

    public boolean addNewRailroadCar(RailroadCar railroadCar) {
        if (locomotiv.maxAmountOfRailCars() > railroadCars.size()
                && locomotiv.maxCapacityWeight() > countMassOfRailroadCars()) {
            if (railroadCar.isElectrified()) {
                if (locomotiv.maxAmountOfElectricalRailCars() > countElectrifiedRailroadCars())  {
                    railroadCars.add(railroadCar);
                    return true;
                }
                else return false;
            }
            else {
                railroadCars.add(railroadCar);
                return true;
            }
        }
        else return false;
    }

    public List<RailroadCar> getRailroadCars() {
        return new ArrayList<>(railroadCars);
    }

    double countMassOfRailroadCars() {
        double sum = 0;
        for (var rc: railroadCars) {
            sum += rc.getNetWeight();
        }
        return sum;
    }
    int countElectrifiedRailroadCars() {
        int sum = 0;
        for (var rc: railroadCars) {
            if (rc.isElectrified())
                sum++;
        }
        return sum;
    }

    public void setLocomotiv(Locomotiv locomotiv) {
        this.locomotiv = locomotiv;
    }

    public Locomotiv getLocomotiv() {
        return locomotiv;
    }
}
