package ru.shtyrev.patterns.factory;

import ru.shtyrev.patterns.factory.enums.CoffeeType;

public class CoffeeMachine {
    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffeeable getCoffee(CoffeeType coffeeType) {
        System.out.println("Start making coffee");
        Coffeeable coffee = coffeeFactory.getCoffee(coffeeType);
        System.out.println("End making coffee");
        return coffee;
    }
}
