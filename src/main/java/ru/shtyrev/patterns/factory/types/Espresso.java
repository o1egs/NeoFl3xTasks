package ru.shtyrev.patterns.factory.types;

import ru.shtyrev.patterns.factory.Coffeeable;

public class Espresso implements Coffeeable {
    @Override
    public void coffee() {
        System.out.println("espresso");
    }
}
