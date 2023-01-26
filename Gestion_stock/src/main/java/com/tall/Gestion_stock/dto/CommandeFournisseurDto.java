package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.CommandeFournisseur;
import com.tall.Gestion_stock.model.Fournisseur;
import com.tall.Gestion_stock.model.LigneCommandeFournisseur;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data

@Builder
public class CommandeFournisseurDto  {
    private  Integer id;
    private  String code;
    private Instant dateCommande;
    private FournisseurDto fournisseur;
    private List<LigneCommandeFournisseurDto>ligneCommandeFournisseurs;
    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if (commandeFournisseur==null)
        {
            return null;
        }
       return CommandeFournisseurDto.builder()
               .id(commandeFournisseur.getId())
               .code(commandeFournisseur.getCode())
               .dateCommande(commandeFournisseur.getDateCommande())
               .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
               .build();
    }
    public static CommandeFournisseur toEntity (CommandeFournisseurDto commandeFournisseurDto){
        if (commandeFournisseurDto ==null)
        {
            return null;
        }
        CommandeFournisseur commandeFournisseur=new CommandeFournisseur();
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()));
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        return  commandeFournisseur;
    }
}