package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;

    @ManyToOne
    private FinancialAdvisor advisor;

    public Client() {}

    public Client(Long clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
