package com.example.stocksbackendspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "sbitop_prices")
@Getter
@Setter
public class SBITOPPrices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp created_timestamp;

    private String mic;

    private String segment;

    private String symbol;

    private String isin;

    private String model;

    private BigDecimal open_price;

    private BigDecimal high_price;

    private BigDecimal low_price;

    private BigDecimal close_price;

    private Timestamp trade_date;

    private BigDecimal vwap_price;

    private BigDecimal change_percent;

    private Integer num_trades;

    private BigDecimal volume;

    private BigDecimal turnover;

    private String security_class;

    private String security_type;

    public SBITOPPrices(Integer id, Timestamp created_timestamp, String mic, String segment, String symbol, String isin, String model, BigDecimal open_price, BigDecimal high_price, BigDecimal low_price, BigDecimal close_price, Timestamp trade_date, BigDecimal vwap_price, BigDecimal change_percent, Integer num_trades, BigDecimal volume, BigDecimal turnover, String security_class, String security_type) {
        this.id = id;
        this.created_timestamp = created_timestamp;
        this.mic = mic;
        this.segment = segment;
        this.symbol = symbol;
        this.isin = isin;
        this.model = model;
        this.open_price = open_price;
        this.high_price = high_price;
        this.low_price = low_price;
        this.close_price = close_price;
        this.trade_date = trade_date;
        this.vwap_price = vwap_price;
        this.change_percent = change_percent;
        this.num_trades = num_trades;
        this.volume = volume;
        this.turnover = turnover;
        this.security_class = security_class;
        this.security_type = security_type;
    }

    public SBITOPPrices() {

    }
}
