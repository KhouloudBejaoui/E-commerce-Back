package com.server.server.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.server.server.Entity.Client;
import com.server.server.Entity.Commande;

import com.server.server.Entity.Produit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PanierDto {
  private long id_panier;
  private transient Client client;
  private transient List<Produit> produits;

}
