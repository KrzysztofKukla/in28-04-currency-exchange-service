package pl.kukla.krzys.in28minutes.microservice.currencyexchangeservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeValue {

    @Id
    @GeneratedValue(generator = "UUID") //Hibernate automatically will generate UUID settings for us
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    //UUID is mapping to varchar and to easy read it from database we need to define type explicitly
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;

    //name for column cannot be 'from', so we need to explicitly set up that name
    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;

}
