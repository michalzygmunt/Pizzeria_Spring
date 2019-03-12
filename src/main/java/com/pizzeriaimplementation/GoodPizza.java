package com.pizzeriaimplementation;

import com.pizzeriaapi.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Primary
@Component
@PropertySource("classpath:ceny.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GoodPizza implements IPizza {
    private int price;
    private String name;


    public GoodPizza(@Value("${nazwa}") String name,@Value("${cena_dobrej}") int price){
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

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
