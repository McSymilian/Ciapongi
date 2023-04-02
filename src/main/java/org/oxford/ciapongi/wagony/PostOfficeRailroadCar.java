package org.oxford.ciapongi.wagony;

public class PostOfficeRailroadCar extends RailroadCar {
    private int numberOfLetters;
    private int numberOfPackages;

    public PostOfficeRailroadCar() {
        super();
        this.setNumberOfLetters(0);
        this.setNumberOfPackages(0);

        super.setElectrified(true);
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public void setNumberOfLetters(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }
}
