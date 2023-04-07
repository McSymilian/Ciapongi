package org.oxford.ciapongi;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MainWindowController {
    private static final DoubleProperty globalTime = new SimpleDoubleProperty(System.currentTimeMillis());
    static {
        new Thread(() -> {
            while (true) {
                globalTime.set(System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public static DoubleProperty getGlobalTime() {
        return globalTime;
    }

}