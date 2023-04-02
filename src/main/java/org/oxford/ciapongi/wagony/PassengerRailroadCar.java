package org.oxford.ciapongi.wagony;

import org.oxford.ciapongi.id_generators.RailroadCarIdGenerator;

public class PassengerRailroadCar extends RailroadCar {
    //todo two methods
    public int getSeats() {
        return seats;
    }

    private void setSeats(int seats) {
        this.seats = seats;
    }

    private int seats;
    public PassengerRailroadCar() {
        super();
        super.setElectrified(true);

        this.setSeats(24);
    }


}
