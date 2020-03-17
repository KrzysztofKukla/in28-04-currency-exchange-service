package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Krzysztof Kukla
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExchangeValueNotFoundException extends RuntimeException {
    private String message;

    public ExchangeValueNotFoundException(String message) {
        this.message = message;
    }

}
