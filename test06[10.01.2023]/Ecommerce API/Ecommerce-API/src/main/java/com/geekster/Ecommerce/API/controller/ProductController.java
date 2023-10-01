package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.model.Place;
import com.geekster.Ecommerce.API.model.Product;
import com.geekster.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product newProduct)
    {
        return productService.saveProduct(newProduct);
    }

    @GetMapping("products")
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @DeleteMapping("product/{id}")
    public String removeProduct(@PathVariable Integer id)
    {
        return productService.removeProduct(id);
    }


}
