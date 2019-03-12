package com.pizzeriaimplementation;

import com.pizzeriaapi.GoodPizza;
import com.pizzeriaapi.IOrder;
import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Value("#{pizzaList[1]}")
    private IPizza pizza;

    @Autowired
    private List<IPizza> pizzaList;

    public ExclusiveOrder(){
        super();
    }

 //   @Value("#{ecoticPizza}")
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
