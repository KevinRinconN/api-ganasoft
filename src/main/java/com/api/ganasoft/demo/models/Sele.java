package com.api.ganasoft.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Sele")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sele implements Serializable{

    @Id
    private Integer id;
    private Date date;
    private Double purchaseValue;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "sele")
    private List<Cattle> cattle;


    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

}
