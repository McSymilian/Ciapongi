package org.oxford.ciapongi.transport;

import org.oxford.ciapongi.trains.Train;

public class RoutController {
    private final Rout rout;
    private final Train train;
    private double speed;


    public RoutController(Rout rout, Train train) {
        this.rout = rout;
        this.train = train;


    }

    public Rout getRout() {
        return rout;
    }

    public Train getTrain() {
        return train;
    }

    public double getSpeed() {
        return speed;
    }
}
