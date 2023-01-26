package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@EqualsAndHashCode(callSuper = true)
public class Article extends  AbstractEntity{
    private  String codeArticle;
    private  String designation;
    private BigDecimal prixUnitaireHt;
    private  BigDecimal tauxTva;
    private  BigDecimal prixUnitaireTtc;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private  Category category;
}
