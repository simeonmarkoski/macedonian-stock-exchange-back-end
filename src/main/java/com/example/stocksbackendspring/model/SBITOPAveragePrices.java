package com.example.stocksbackendspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "group_by_time_sbitop_prices")
@Immutable
@Getter
@Setter
public class SBITOPAveragePrices {

    @Id
    private Timestamp created_timestamp;

    private BigDecimal open_price;

    private BigDecimal high_price;

    private BigDecimal low_price;

    private BigDecimal close_price;

    public SBITOPAveragePrices(Timestamp created_timestamp, BigDecimal open_price, BigDecimal high_price, BigDecimal low_price, BigDecimal close_price) {
        this.created_timestamp = created_timestamp;
        this.open_price = open_price;
        this.high_price = high_price;
        this.low_price = low_price;
        this.close_price = close_price;
    }

    public SBITOPAveragePrices() {}
}
