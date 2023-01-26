package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

public class Utilisateur extends  AbstractEntity{
    private String nom;
    private  String prenom;
    @Embedded
    private  Adresse adresse;
    private Instant dateDeNaissance;
    private  String motdepass;
    private  String email;
    private  String photo;
    private  String mail;
    private String numTel;
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
    @ManyToOne()
    @JoinColumn(name = "identreprise")
    private  Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private  List<Roles> roles;
}
