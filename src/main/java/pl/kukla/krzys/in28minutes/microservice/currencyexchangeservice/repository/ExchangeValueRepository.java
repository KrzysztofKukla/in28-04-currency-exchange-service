package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.domain.ExchangeValue;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, UUID> {

    Optional<ExchangeValue> findByFromAndTo(String from, String to);

}
