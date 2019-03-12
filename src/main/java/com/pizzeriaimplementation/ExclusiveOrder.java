package com.pizzeriaimplementation;

import com.pizzeriaapi.GoodPizza;
import com.pizzeriaapi.IOrder;
import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {


    private IPizza pizza;

    public ExclusiveOrder(){
        super();
    }

    @Autowired
    public void setPizza(IPizza pizza) {

        this.pizza = pizza;
    }

    public IPizza getPizza() {
        return pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamowienie exclusive: " + pizza.getName() + " cena: " + pizza.getPrice());

    }
}
