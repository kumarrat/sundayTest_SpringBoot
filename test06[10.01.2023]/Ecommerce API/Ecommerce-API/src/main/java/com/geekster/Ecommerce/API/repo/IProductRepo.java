package com.geekster.Ecommerce.API.repo;

import com.geekster.Ecommerce.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
