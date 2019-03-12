package com.pizzeriaimplementation;

import com.pizzeriaapi.GoodPizza;
import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@GoodPizza
public class EcoticPizza implements IPizza {
    private int price;
    private String name;
    @Value("#{goodPizza.price matches '[1-9][1-9]'}")
    boolean bool;


    public EcoticPizza(@Value("#{goodPizza.getName()?.toUpperCase()}") String name,@Value("#{goodPizza.price < 10 ? 10 : 100}") int price){
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        System.out.println(bool);
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }


}
