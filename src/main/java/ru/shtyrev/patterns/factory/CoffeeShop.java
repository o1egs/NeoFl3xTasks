package ru.shtyrev.patterns.factory;

import ru.shtyrev.patterns.factory.enums.CoffeeType;

public class CoffeeShop {
    private final CoffeeMachine coffeeMachine;

    public CoffeeShop(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffeeable getCoffee(CoffeeType coffeeType) {
        return coffeeMachine.getCoffee(coffeeType);
    }

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        CoffeeShop coffeeShop = new CoffeeShop(coffeeMachine);
        System.out.println(coffeeShop.getCoffee(CoffeeType.ESPRESSO).getClass().getSimpleName());
        System.out.println(coffeeShop.getCoffee(CoffeeType.AMERICANO).getClass().getSimpleName());
    }
}
