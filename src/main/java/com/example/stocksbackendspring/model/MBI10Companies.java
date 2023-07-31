package com.example.stocksbackendspring.model;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.sql.Timestamp;

@TypeDefs({
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        )
})

@Data
@Entity
@Table(name = "mbi10_companies")
@Getter
@Setter
public class MBI10Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String symbol;

    private String address;

    private String city;

    private String country_alpha2;

    private String email;

    private String website;

    private String phone_number;

    private String fax_number;

    @Type(type = "string-array")
    @Column(
            columnDefinition = "text[]"
    )
    private String[] description;

    private String category;

    private String hash;

    public MBI10Companies(String name, String symbol, String address, String city, String country_alpha2, String email, String website, String phone_number, String fax_number, String[] description, String category, String hash) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.city = city;
        this.country_alpha2 = country_alpha2;
        this.email = email;
        this.website = website;
        this.phone_number = phone_number;
        this.fax_number = fax_number;
        this.description = description;
        this.category = category;
        this.hash = hash;
    }

    public MBI10Companies() {

    }
}
