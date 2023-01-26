package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

public class LigneVente extends  AbstractEntity{
    @ManyToOne()
    @JoinColumn(name = "idvente")
    private Ventes ventes;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

    //partie 5 14MIN
}
