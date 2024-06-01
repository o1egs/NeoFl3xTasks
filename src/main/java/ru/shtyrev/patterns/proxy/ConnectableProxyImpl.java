package ru.shtyrev.patterns.proxy;

public class ConnectableProxyImpl implements Connectable {
    private ConnectableImpl connectable;

    @Override
    public void connect() {
        System.out.println("Connected to localhost:5432/" + connectable.getDatabaseName());
    }
}
