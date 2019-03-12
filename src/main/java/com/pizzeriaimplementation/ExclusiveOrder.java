package com.pizzeriaimplementation;

import com.pizzeriaapi.IOrder;
import com.pizzeriaapi.IPizza;

public class ExclusiveOrder implements IOrder {
    private IPizza pizza;

    public ExclusiveOrder(IPizza pizza){
        super();
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamowienie: " + pizza.getName() + " cena: " + pizza.getPrice());

    }
}
