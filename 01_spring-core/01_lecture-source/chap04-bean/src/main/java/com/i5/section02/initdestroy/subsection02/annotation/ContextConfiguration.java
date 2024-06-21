package com.i5.section02.initdestroy.subsection02.annotation;

import com.i5.common.Beverage;
import com.i5.common.Bread;
import com.i5.common.Product;
import com.i5.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@ComponentScan("com.i5.section02.initdestroy.subsection02.annotation")
public class ContextConfiguration {
    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new Date()) ;
    }

    @Bean
    public Product milk() {
        return new Beverage("딸기우유", 1500, 500) ;
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 500) ;
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}