package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Size for name must be between 3 and 80 characters")
    @NotBlank(message = "Required information")
    private String name;
    @Size(min = 3, message = "Size for description must be at least 10 characters")
    private String description;
    @Positive(message = "Price needs to be a positive value")
    private Double price;
    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
       id = entity.getId();
       name = entity.getName();
       description = entity.getDescription();
       price = entity.getPrice();
       imgUrl = entity.getImgUrl();
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
