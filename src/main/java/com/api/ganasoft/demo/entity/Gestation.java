package com.api.ganasoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Gestation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gestation implements Serializable{
    @Id
    private Integer id;
    private Date  dateStart;
    private Boolean state;
    private Date  dateApproximate;
    

    @ManyToOne
    @JoinColumn(name="idCattle")
    private Cattle cattle;
}
