package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class CommandeClient extends  AbstractEntity{
    private  String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "idclient")
    private  Client client;
    @OneToMany(mappedBy ="commandeClient" )
    private List<LigneCommandeClient> ligneCommandeClients;
}
