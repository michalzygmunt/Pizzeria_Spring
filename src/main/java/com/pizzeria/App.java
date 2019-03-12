package com.pizzeria;

import com.pizzeriaimplementation.Order;
import com.config.AutoConfig;
import com.pizzeriaapi.IOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);


        IOrder order = context.getBean(IOrder.class);
        order.printOrder();

         IOrder order2 = context.getBean(Order.class);
        order2.printOrder();

    }
}
