package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.Adresse;
import com.tall.Gestion_stock.model.Client;
import com.tall.Gestion_stock.model.CommandeClient;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data

@Builder
public class ClientDto {
    private  Integer id;
    private String nom;
    private  String prenom;

    private Adresse adresse;
    private  String photo;
    private  String mail;
    private String numTel;

    private List<CommandeClientDto> commandeClients;
    public static  Client toEntity(ClientDto clientDto){
       if (clientDto ==null)
       {return  null;
       }
       Client client=new Client();
       client.setId((clientDto.getId()));
       client.setNom(clientDto.getNom());
       client.setPrenom(clientDto.getPrenom());
       client.setAdresse(clientDto.getAdresse());
       client.setPhoto(clientDto.getPhoto());
       client.setMail(clientDto.getMail());
       client.setNumTel(clientDto.getNumTel());
       return  client;
    }
    public  static ClientDto fromEntity(Client client){
       return ClientDto.builder()
               .id(client.getId())
               .nom(client.getNom())
               .prenom(client.getPrenom())
               .adresse(client.getAdresse())
               .photo(client.getPhoto())
               .mail(client.getMail())
               .numTel(client.getNumTel()).build();
    }

}
