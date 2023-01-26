package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor

@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Client extends  AbstractEntity{
    private String nom;
    private  String prenom;
    @Embedded
    private  Adresse adresse;
    private  String photo;
    private  String mail;
    private String numTel;
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
