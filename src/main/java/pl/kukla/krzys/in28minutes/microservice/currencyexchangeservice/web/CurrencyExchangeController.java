package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model.ExchangeValueDto;

import java.math.BigDecimal;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping("/v1/currency-exchange")
@RequiredArgsConstructor
@Slf4j
public class CurrencyExchangeController {

    @GetMapping("/{from}/to/{to}")
    public ResponseEntity<ExchangeValueDto> retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValueDto exchangeValueDto = new ExchangeValueDto(10L, from, to, new BigDecimal(65));
        return ResponseEntity.ok(exchangeValueDto);
    }
}
