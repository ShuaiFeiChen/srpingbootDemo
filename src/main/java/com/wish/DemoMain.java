package com.wish;


import com.wish.domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class DemoMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoMain.class, args);
        String[] beanNames = run.getBeanDefinitionNames();
        for(String name: beanNames){
            System.out.println(name);
        }

        Car bean = run.getBean(Car.class);
        System.out.println(bean);

        CharacterEncodingFilter b = run.getBean(CharacterEncodingFilter.class);
        Object encodeFilter = run.getBean("encodeFilter");
        System.out.println((b == encodeFilter) + "kjkkkkkk");

        System.out.println("hello the world!");
    }
}
