package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

public class Entreprise extends AbstractEntity{
    private  String prenom;
    private  String description;
    @Embedded
    private  Adresse adresse;
    private String codeFiscal;
    private  String photo;
    private  String email;
    private String numTel;
    private String steWeb;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur>  utilisateurs;
}
