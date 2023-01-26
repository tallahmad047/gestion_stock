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

public class LigneCommandeClient extends  AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private  Article article;
    @ManyToOne
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
