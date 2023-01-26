package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.Article;
import com.tall.Gestion_stock.model.CommandeClient;
import com.tall.Gestion_stock.model.LigneCommandeClient;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data

@Builder
public class LigneCommandeClientDto {
    private  Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
      public  static  LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient)
      {
          return LigneCommandeClientDto.builder()
                  .id(ligneCommandeClient.getId())
                  .article(ArticleDto.fromEntity(ligneCommandeClient.getArticle()))
                  .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                  .quantite(ligneCommandeClient.getQuantite())
                  .commandeClient(CommandeClientDto.fromEntity(ligneCommandeClient.getCommandeClient()))
                  .build();
      }
      public  static  LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto)
      {
          LigneCommandeClient ligneCommandeClient=new LigneCommandeClient();
          ligneCommandeClient.setId(ligneCommandeClientDto.getId());
          ligneCommandeClient.setArticle(ArticleDto.toEntity(ligneCommandeClientDto.getArticle()));
          ligneCommandeClient.setCommandeClient(CommandeClientDto.toEntity(ligneCommandeClientDto.getCommandeClient()));
          ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
          ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
          return ligneCommandeClient;
      }
}
