package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity

public class Ventes extends  AbstractEntity{
    private  String code;
    private Instant dateVente;
    private  String commantaire;
}
