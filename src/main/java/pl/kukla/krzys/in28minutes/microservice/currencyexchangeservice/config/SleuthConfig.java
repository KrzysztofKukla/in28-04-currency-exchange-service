package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.config;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Krzysztof Kukla
 */
@Configuration
public class SleuthConfig {

    //the same IdRequest appears in each microservices for the request for example 'e7dd60534b7b146e'
//    020-03-22 15:47:52.251 DEBUG [04-currency-exchange-service,e7dd60534b7b146e,6d44ae1689550148,true]
    @Bean
    public Sampler defaultSampler() {
        //this allows to trace all request
        return Sampler.ALWAYS_SAMPLE;
    }

}
