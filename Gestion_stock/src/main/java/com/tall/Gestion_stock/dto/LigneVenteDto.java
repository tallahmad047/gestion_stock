package com.tall.Gestion_stock.dto;

import com.tall.Gestion_stock.model.Ventes;
import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto  {
    private  Integer id;
    private VentesDto ventes;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    public static VentesDto fromEntity (Ventes ventes)
    {
        return null;
    }

}
