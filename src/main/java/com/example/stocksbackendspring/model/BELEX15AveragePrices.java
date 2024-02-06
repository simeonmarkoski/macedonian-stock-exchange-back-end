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
@Table(name = "group_by_time_belex15_prices")
@Immutable
@Getter
@Setter
public class BELEX15AveragePrices {

    @Id
    private Timestamp created_timestamp;

    private BigDecimal open;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal closing_price;

    public BELEX15AveragePrices(Timestamp created_timestamp, BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal closing_price) {
        this.created_timestamp = created_timestamp;
        this.open = open;
        this.high = high;
        this.low = low;
        this.closing_price = closing_price;
    }

    public BELEX15AveragePrices() {}
}
