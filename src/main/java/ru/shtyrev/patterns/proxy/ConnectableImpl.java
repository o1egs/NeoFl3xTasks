package ru.shtyrev.patterns.proxy;

public class ConnectableImpl implements Connectable {
    private final String databaseName;

    public ConnectableImpl(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + databaseName);
    }
}
