package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalConfig.class,PetConfig.class})
public class AllConfig {

}
