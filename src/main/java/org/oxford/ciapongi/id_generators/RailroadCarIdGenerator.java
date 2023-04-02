package org.oxford.ciapongi.id_generators;

public class RailroadCarIdGenerator {
    private static int nextId = 0;
    public static int generateNextId() {
        return nextId++;
    }
}
