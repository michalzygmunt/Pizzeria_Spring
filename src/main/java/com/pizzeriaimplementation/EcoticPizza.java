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


    public EcoticPizza(@Value("#{goodPizza.getName()?.toUpperCase()}") String name,@Value("#{T(java.lang.Math).random()*10}") int price){
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
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
