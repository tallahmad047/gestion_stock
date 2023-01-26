package com.tall.Gestion_stock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(callSuper = true)
@Entity
public class Category extends  AbstractEntity{
    private String code;
    private  String designation;
    @OneToMany(mappedBy = "category")
    private List<Article> article;
}
