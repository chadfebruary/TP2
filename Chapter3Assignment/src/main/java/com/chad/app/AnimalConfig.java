package com.chad.app;

/**
 * Created by student on 2016/04/04.
 */

import javax.security.auth.login.Configuration;

@Configuration
public class AnimalConfig {

    @Bean(name = "cow")
    public Animal getCow()
    {
        return new CowImpl();
    }

    @Bean(name = "horse")
    public Animal getHorse()
    {
        return new HorseImpl();
    }

    @Bean(name = "sheep")
    public Animal getSheep()
    {
        return new SheepImpl();
    }

}
