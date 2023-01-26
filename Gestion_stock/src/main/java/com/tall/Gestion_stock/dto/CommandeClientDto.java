package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.Client;
import com.tall.Gestion_stock.model.CommandeClient;
import com.tall.Gestion_stock.model.LigneCommandeClient;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder

public class CommandeClientDto {
    private  Integer id;
    private  String code;
    private Instant dateCommande;
    private ClientDto client;
    private List<LigneCommandeClientDto> ligneCommandeClients;
    public   static CommandeClientDto  fromEntity(CommandeClient commandeClient)
    {
        if (commandeClient==null)
        {
            return null;
        }
        return  CommandeClientDto.builder()
                .id(commandeClient.getId())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }
    public  static CommandeClient toEntity(CommandeClientDto commandeClientDto)
    {
        if (commandeClientDto==null)
        {
            return null;
        }
        CommandeClient commandeClient=new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        commandeClient.setCode(commandeClient.getCode());
        commandeClient.setDateCommande(commandeClient.getDateCommande());
        return  commandeClient;
    }

}
