package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.service.ExchangeValueService;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model.ExchangeValueDto;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping("/v1/currency-exchange")
@RequiredArgsConstructor
@Slf4j
public class CurrencyExchangeController {

    private final Environment environment;
    private final ExchangeValueService exchangeValueService;

    @GetMapping("/{from}/to/{to}")
    public ResponseEntity<ExchangeValueDto> retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        log.debug("server port=> " + environment.getProperty("server.port"));
        ExchangeValueDto exchangeValueDto = exchangeValueService.findByFromAndTo(from, to);
        return ResponseEntity.ok(exchangeValueDto);
    }

}
