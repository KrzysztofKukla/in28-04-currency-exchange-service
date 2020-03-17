package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeValueDto {

    @Null
    private UUID id;

    @NotBlank
    private String from;
    @NotBlank
    private String to;
    @Positive
    private BigDecimal conversionMultiple;
}
