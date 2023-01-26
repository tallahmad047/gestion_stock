package com.tall.Gestion_stock.dto;


import com.tall.Gestion_stock.model.Article;
import lombok.*;


import java.math.BigDecimal;

@Data
@Builder

public class ArticleDto  {
    private  Integer id;
    private  String codeArticle;
    private  String designation;
    private BigDecimal prixUnitaireHt;
    private  BigDecimal tauxTva;
    private  BigDecimal prixUnitaireTtc;
    private String photo;
    private  CategoryDto category;
    public  static  ArticleDto fromEntity(Article article){
        if(article ==null)
        {
            return  null;
        }
        return  ArticleDto.builder().id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .category(CategoryDto.fromEntity(article.getCategory())).build();
    }
    public  static Article toEntity(ArticleDto articleDto){
        if(articleDto== null){
            return  null;
        }
        Article article=new Article();
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setId(articleDto.getId());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
        article.setDesignation(articleDto.getDesignation());
        article.setPhoto(articleDto.getPhoto());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        return article;
    }

}
