package ru.shtyrev.patterns.factory;

import ru.shtyrev.patterns.factory.enums.CoffeeType;
import ru.shtyrev.patterns.factory.types.Americano;
import ru.shtyrev.patterns.factory.types.Espresso;

public class CoffeeFactory {
    public Coffeeable getCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }
}
