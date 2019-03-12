package com.pizzeriaimplementation;

import com.pizzeriaapi.IOrder;
import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order  implements IOrder {
    IPizza pizza;

    public Order(@Qualifier("Dobra") IPizza pizza){
        super();
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamowienie: " + pizza.getName() + " cena: " + pizza.getPrice());
    }


}
