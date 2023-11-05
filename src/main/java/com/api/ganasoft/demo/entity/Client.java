package com.api.ganasoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable{

    @Id
    private Integer id;
    private String name;
    private String email;
    private String phone;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    private List<Sele> sele;
}
