package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.*;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data

@Builder
public class UtilisateurDto  {
    private  Integer id;
    private String nom;
    private  String prenom;
    private Adresse adresse;
    private Instant dateDeNaissance;
    private  String motdepass;
    private  String email;
    private  String photo;
    private  String mail;
    private String numTel;
    private List<CommandeClientDto> commandeClients;
    private EntrepriseDto entreprise;
    private  List<RolesDto> roles;
}
