package ru.shtyrev.patterns.factory.types;

import ru.shtyrev.patterns.factory.Coffeeable;

public class Americano implements Coffeeable {
    @Override
    public void coffee() {
        System.out.println("americano");
    }
}
