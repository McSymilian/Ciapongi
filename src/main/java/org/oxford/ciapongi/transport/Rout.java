package org.oxford.ciapongi.transport;

import static java.lang.Math.*;

public record Rout(int id, Station stationA, Station stationB) {
    public double getDistance() {
        return sqrt(pow(stationA.x() - stationB.x(), 2) + pow(stationA.x() - stationB.x(), 2));
    }
}
