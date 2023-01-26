package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import com.tall.Gestion_stock.model.Adresse;
import com.tall.Gestion_stock.model.Entreprise;
import com.tall.Gestion_stock.model.Utilisateur;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data

@Builder
public class EntrepriseDto  {
    private  Integer id;
    private  String prenom;
    private  String description;

    private Adresse adresse;
    private String codeFiscal;
    private  String photo;
    private  String email;
    private String numTel;
    private String steWeb;
    private List<UtilisateurDto>  utilisateurs;
    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise==null)
        {
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .prenom(entreprise.getPrenom())
                .description(entreprise.getDescription())
                .adresse(entreprise.getAdresse())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .steWeb(entreprise.getSteWeb())
                .build();
    }
    public  static Entreprise toEntity(EntrepriseDto entrepriseDto){
        Entreprise entreprise=new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setPrenom(entrepriseDto.getPrenom());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setAdresse(entrepriseDto.getAdresse());
        entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setSteWeb(entrepriseDto.getSteWeb());
        return entreprise;
    }
}
