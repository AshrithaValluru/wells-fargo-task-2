package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private LocalDate purchaseDate;
    private Double purchasePrice;
    private Integer quantity;

    @ManyToOne
    private Portfolio portfolio;

    public Security() {}

    public Security(Long securityId, String name, String category,
                    LocalDate purchaseDate, Double purchasePrice,
                    Integer quantity) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
