package com.training.mystore.controller;

import com.training.mystore.model.Product;
import com.training.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //Get all products
    @GetMapping(value="/all")
    public  List<Product> getAllProductsinfo(){
        return this.productService.getAllProducts();

    }

    //Add products
    @PostMapping(value="/add")
    public String addNewProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }

    //Update specific product
   @PutMapping(value="/update/{id}")
    public String updateProduct(@PathVariable String id,@RequestBody Product product) {
        this.productService.updateProduct(id, product);
       return "Updated product successfully.";
   }

   //Delete specific product
   @DeleteMapping(value="/delete/{id}")
   public String deleteProduct(@PathVariable String id){
       return this.productService.deleteProduct(id);
   }

   //get specific product
   @GetMapping(value="/get/{id}")
   public Product getProductinfo(@PathVariable String id){
       return this.productService.getSpecificProduct(id);

   }
}
