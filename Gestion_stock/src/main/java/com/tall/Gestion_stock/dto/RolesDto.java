package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.Utilisateur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data

@Builder
public class RolesDto  {
    private  Integer id;
    private  String rolename;

    private UtilisateurDto utilisateur;
}
