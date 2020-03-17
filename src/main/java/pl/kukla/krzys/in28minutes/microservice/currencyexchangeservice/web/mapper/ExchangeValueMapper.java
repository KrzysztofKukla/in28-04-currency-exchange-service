package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.mapper;

import org.mapstruct.Mapper;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.domain.ExchangeValue;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model.ExchangeValueDto;

/**
 * @author Krzysztof Kukla
 */
@Mapper(componentModel = "spring")
public interface ExchangeValueMapper {

    ExchangeValueDto exchangeValueToExchangeValueDto(ExchangeValue exchangeValue);

    ExchangeValue exchangeValueDtoToExchangeValue(ExchangeValueDto exchangeValueDto);

}
