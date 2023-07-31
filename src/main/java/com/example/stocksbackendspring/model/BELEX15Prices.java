package com.example.stocksbackendspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "belex15_prices")
@Getter
@Setter
public class BELEX15Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer belex_id;

    private Timestamp created_timestamp;

    @ManyToOne
    private BELEX15Companies company;

    private BigDecimal closing_price;

    private String change_perc;

    private BigDecimal open;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal vwap;

    private BigDecimal traded_volume;

    private BigDecimal traded_value_rsd;

    private BigDecimal last_price;

    private String change_abs;

    private BigDecimal bid_volume;

    private BigDecimal aks_volume;

    public BELEX15Prices(Integer id, Integer belex_id, Timestamp created_timestamp, BELEX15Companies company, BigDecimal closing_price, String change_perc, BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal vwap, BigDecimal traded_volume, BigDecimal traded_value_rsd, BigDecimal last_price, String change_abs, BigDecimal bid_volume, BigDecimal aks_volume) {
        this.id = id;
        this.belex_id = belex_id;
        this.created_timestamp = created_timestamp;
        this.company = company;
        this.closing_price = closing_price;
        this.change_perc = change_perc;
        this.open = open;
        this.high = high;
        this.low = low;
        this.vwap = vwap;
        this.traded_volume = traded_volume;
        this.traded_value_rsd = traded_value_rsd;
        this.last_price = last_price;
        this.change_abs = change_abs;
        this.bid_volume = bid_volume;
        this.aks_volume = aks_volume;
    }

    public BELEX15Prices() {

    }
}
