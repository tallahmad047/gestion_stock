package com.tall.Gestion_stock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class Adresse {
    private  String adresse1;
    private  String adresse2;
    private  String ville;
    private  String codePostale;
    private String pays;
}
