package com.tall.Gestion_stock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tall.Gestion_stock.model.Category;
import lombok.*;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    private  Integer id;
    private String code;
    private  String designation;
    @JsonIgnore
    private List<ArticleDto> article;
    public  static CategoryDto fromEntity(Category category){
        if (category ==null){
            // TODP throw exeception
            return  null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation()).build();
    }
    public static Category toEntity(CategoryDto categoryDto){
        if (categoryDto ==null){
            // TODP throw exeception
            return  null;
        }
        Category category=new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }
}
