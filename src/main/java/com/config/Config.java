package com.config;

import com.pizzeriaimplementation.EcoticPizza;
import com.pizzeriaimplementation.GoodPizza;
import com.pizzeriaimplementation.Order;
import com.pizzeriaapi.IOrder;
import com.pizzeriaapi.IPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    /*@Bean
    public IPizza pizza(){
        return new EcoticPizza("egzotyczna",17);
    }*/

  /*  @Bean (name = "inna")
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }

    @Bean
    public IPizza pizza2(){
        return new GoodPizza("Smaczna",50);
    }*/
}
