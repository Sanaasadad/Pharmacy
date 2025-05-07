package com.Pharmacy.Pharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    public String nom;
    public int quantite;
    public   double prix;
    public String description;

    @Override
    public String toString() {
        return "ProductDto{" +
                "nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                '}';
    }
}
