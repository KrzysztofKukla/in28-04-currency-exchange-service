package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.domain.ExchangeValue;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.exception.ExchangeValueNotFoundException;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.repository.ExchangeValueRepository;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.mapper.ExchangeValueMapper;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model.ExchangeValueDto;

import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExchangeValueServiceImpl implements ExchangeValueService {

    private final ExchangeValueRepository exchangeValueRepository;
    private final ExchangeValueMapper exchangeValueMapper;

    @Override
    public ExchangeValueDto findById(UUID id) {
        ExchangeValue exchangeValue = exchangeValueRepository.findById(id).orElseThrow(() -> {
            log.error("Cannot find ExchangeValue for {} id", id);
            throw new ExchangeValueNotFoundException(id.toString());
        });

        return exchangeValueMapper.exchangeValueToExchangeValueDto(exchangeValue);

    }

    @Override
    public ExchangeValueDto findByFromAndTo(String from, String to) {
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to).orElseThrow(() -> {
            log.error("Cannot find ExchangeValue to convert from {} to {}", from, to);
            throw new ExchangeValueNotFoundException(from + "-> " + to);
        });
        return exchangeValueMapper.exchangeValueToExchangeValueDto(exchangeValue);
    }

}
