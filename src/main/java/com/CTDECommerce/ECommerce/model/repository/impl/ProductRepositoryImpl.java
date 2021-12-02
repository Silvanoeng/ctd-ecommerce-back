package com.CTDECommerce.ECommerce.model.repository.impl;

import com.CTDECommerce.ECommerce.model.entities.CategoryEntity;
import com.CTDECommerce.ECommerce.model.entities.ProductEntity;
import com.CTDECommerce.ECommerce.model.repository.ProductRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public abstract class ProductRepositoryImpl implements ProductRepository {
    @Query("select p from product where p.category_id=?1")
    public abstract ProductEntity findByCategory(String category);
}
