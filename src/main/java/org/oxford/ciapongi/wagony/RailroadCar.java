package org.oxford.ciapongi.wagony;

import org.oxford.ciapongi.id_generators.RailroadCarIdGenerator;

public abstract class RailroadCar {

    private int id;

    private float netWeight;

    private float grossWeight;

    private String[] securityInformation;


    private boolean isElectrified;

    public RailroadCar() {
        this.setId(RailroadCarIdGenerator.generateNextId());
    }

    public float getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(float netWeight) {
        this.netWeight = netWeight;
    }

    public float getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(float grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String[] getSecurityInformation() {
        return securityInformation;
    }

    public void setSecurityInformation(String[] securityInformation) {
        this.securityInformation = securityInformation;
    }

    public int getId() {
        return id;
    }

    public boolean isElectrified() {
        return isElectrified;
    }

    private void setId(int id) {
        this.id = id;
    }

    protected void setElectrified(boolean electrified) {
        isElectrified = electrified;
    }
}
