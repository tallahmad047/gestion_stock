package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.AbstractEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.Instant;

@Data
@Builder
public class VentesDto  {
    private  Integer id;
    private  String code;
    private Instant dateVente;
    private  String commantaire;
}
