package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Place;
import com.geekster.Ecommerce.API.model.Product;
import com.geekster.Ecommerce.API.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String saveProduct(Product newProduct) {
        productRepo.save(newProduct);
        return "product added";
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public String removeProduct(Integer id) {

        productRepo.deleteById(id);
        return "product removed";
    }
}
