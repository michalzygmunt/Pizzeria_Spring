package com.pizzeriaimplementation;

import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Qualifier("Dobra")
public class GoodPizza implements IPizza {
    private int price;
    private String name;


    public GoodPizza(@Value("GOODODASDPIZA") String name,@Value("999") int price){
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
