package com.CTDECommerce.ECommerce.model.entities;

import com.CTDECommerce.ECommerce.model.dto.ProductDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="price")
    private Double price;

    @Column(name="description")
    private String description;

    @Column(name="image")
    private String image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name="category_id")
    private CategoryEntity categoryEntity;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String title, Double price, String description, String image,
                         CategoryEntity categoryEntity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.categoryEntity = categoryEntity;
    }

    public ProductEntity(ProductDTO productDTO) {
        this.id = productDTO.getId();
        this.title = productDTO.getTitle();
        this.price = productDTO.getPrice();
        this.description = productDTO.setDescription();
        this.image = productDTO.getImage();
    }
}
