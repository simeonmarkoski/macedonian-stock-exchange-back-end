package com.example.stocksbackendspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "mbi10_prices")
@Getter
@Setter
public class MBI10Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp created_timestamp;

    @ManyToOne
    private MBI10Companies company;

    private BigDecimal average_price;

    private BigDecimal turnover_ratio;

    private BigDecimal buy_order;

    private BigDecimal sell_order;

    private BigDecimal min_value;

    private BigDecimal max_value;

    private BigDecimal last_price;

    private Integer quantity;

    public MBI10Prices(MBI10Companies company, BigDecimal average_price, BigDecimal turnover_ratio, BigDecimal buy_order, BigDecimal sell_order, BigDecimal min_value, BigDecimal max_value, BigDecimal last_price, Integer quantity) {
        this.company = company;
        this.average_price = average_price;
        this.turnover_ratio = turnover_ratio;
        this.buy_order = buy_order;
        this.sell_order = sell_order;
        this.min_value = min_value;
        this.max_value = max_value;
        this.last_price = last_price;
        this.quantity = quantity;
    }

    public MBI10Prices() {

    }
}
