package com.config;

import com.pizzeriaapi.IPizza;
import com.pizzeriaimplementation.EcoticPizza;
import com.pizzeriaimplementation.GoodPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com")
public class AutoConfig {

    @Bean
    public List<IPizza> pizzaList(){
        List<IPizza> pizzaList = new ArrayList<>();
        pizzaList.add(new EcoticPizza("egzotyczna",20));
        pizzaList.add(new GoodPizza("bardzo dobra", 18));
        return pizzaList;
    }

}
