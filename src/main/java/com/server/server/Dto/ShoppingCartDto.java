package com.server.server.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.server.server.Entity.Client;

import com.server.server.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShoppingCartDto implements Serializable {
  private long id;
  private Date date_adding_product;
  private transient Product product;
  private transient Client client;


}


