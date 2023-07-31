package com.example.stocksbackendspring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "belex15_companies")
@Getter
@Setter
public class BELEX15Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name_of_security;

    private String symbol;

    private String market;

    private String trading_method;

    private String registry_number;

    private String isin;

    private String cfi;

    private String sector_code;

    private String sector_name;

    private String number_of_shares_in_outstanding;

    private String number_of_shares_in_trading;

    private String currency;

    private String statistical_overview_of_ownership_structure;

    private String website;

    private String full_name;

    private String legal_status;

    private String address;

    private Timestamp date_of_establishment;

    private String number_of_the_decision_of_entry_in_the_court_register;

    private String identification_number;

    private String tax_identification_number;

    private String activity_code;

    private String name_and_surname_of_the_director;

    private String name_and_surname_of_the_contact_person;

    private String phone;

    private String fax;

    private String email;

    private String name_of_corporate_agent;

    private String category;

    private String hash;

    public BELEX15Companies(String name_of_security, String symbol, String market, String trading_method, String registry_number, String isin, String cfi, String sector_code, String sector_name, String number_of_shares_in_outstanding, String number_of_shares_in_trading, String currency, String statistical_overview_of_ownership_structure, String website, String full_name, String legal_status, String address, Timestamp date_of_establishment, String number_of_the_decision_of_entry_in_the_court_register, String identification_number, String tax_identification_number, String activity_code, String name_and_surname_of_the_director, String name_and_surname_of_the_contact_person, String phone, String fax, String email, String name_of_corporate_agent, String category, String hash) {
        this.name_of_security = name_of_security;
        this.symbol = symbol;
        this.market = market;
        this.trading_method = trading_method;
        this.registry_number = registry_number;
        this.isin = isin;
        this.cfi = cfi;
        this.sector_code = sector_code;
        this.sector_name = sector_name;
        this.number_of_shares_in_outstanding = number_of_shares_in_outstanding;
        this.number_of_shares_in_trading = number_of_shares_in_trading;
        this.currency = currency;
        this.statistical_overview_of_ownership_structure = statistical_overview_of_ownership_structure;
        this.website = website;
        this.full_name = full_name;
        this.legal_status = legal_status;
        this.address = address;
        this.date_of_establishment = date_of_establishment;
        this.number_of_the_decision_of_entry_in_the_court_register = number_of_the_decision_of_entry_in_the_court_register;
        this.identification_number = identification_number;
        this.tax_identification_number = tax_identification_number;
        this.activity_code = activity_code;
        this.name_and_surname_of_the_director = name_and_surname_of_the_director;
        this.name_and_surname_of_the_contact_person = name_and_surname_of_the_contact_person;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.name_of_corporate_agent = name_of_corporate_agent;
        this.category = category;
        this.hash = hash;
    }

    public BELEX15Companies() {

    }
}
