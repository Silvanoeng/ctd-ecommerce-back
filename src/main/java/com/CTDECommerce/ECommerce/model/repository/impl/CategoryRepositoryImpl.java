package com.CTDECommerce.ECommerce.model.repository.impl;

import com.CTDECommerce.ECommerce.model.entities.CategoryEntity;
import com.CTDECommerce.ECommerce.model.repository.CategoryRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CategoryRepositoryImpl implements CategoryRepository {
    @Query("select c from category c where c.id=?1")
    public abstract CategoryEntity findByName(String nameCategory);
}
