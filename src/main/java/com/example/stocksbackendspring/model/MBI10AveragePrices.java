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
@Table(name = "group_by_time_mbi10_prices")
@Immutable
@Getter
@Setter
public class MBI10AveragePrices {

    @Id
    private Timestamp created_timestamp;

    private BigDecimal average_price;

    private BigDecimal max_value;

    private BigDecimal min_value;

    private BigDecimal last_price;

    public MBI10AveragePrices(Timestamp created_timestamp, BigDecimal average_price, BigDecimal max_value, BigDecimal min_value, BigDecimal last_price) {
        this.created_timestamp = created_timestamp;
        this.average_price = average_price;
        this.max_value = max_value;
        this.min_value = min_value;
        this.last_price = last_price;
    }

    public MBI10AveragePrices() {}
}
