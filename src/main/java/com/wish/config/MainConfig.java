package com.wish.config;

import com.wish.domain.Car;
import com.wish.domain.Pet;
import com.wish.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
//@ConditionalOnBean(name = "pet01")
@Import(value = Pet.class)
@ImportResource(value = "classpath:beans.xml")
@ConditionalOnMissingBean(name = "pet01")
//@EnableConfigurationProperties(Car.class)
public class MainConfig {

    @Bean
    public Pet pet(){
        return new Pet();
    }

    @Bean
    public User user(){
        return new User();
    }

    @Bean(value = "encodeFilter")
    public CharacterEncodingFilter characterEncodingFilter(){
        return new CharacterEncodingFilter();
    }

}
