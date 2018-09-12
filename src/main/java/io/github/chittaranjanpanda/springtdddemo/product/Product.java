package io.github.chittaranjanpanda.springtdddemo.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity ( name = "PRODUCT" )
public class Product implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String uom;
}
