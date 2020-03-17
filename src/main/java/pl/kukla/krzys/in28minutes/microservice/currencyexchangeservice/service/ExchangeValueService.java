package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.service;

import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model.ExchangeValueDto;

import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
public interface ExchangeValueService {

    ExchangeValueDto findById(UUID id);

    ExchangeValueDto findByFromAndTo(String from, String to);

}
