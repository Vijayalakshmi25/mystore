package com.training.mystore.service;

import com.training.mystore.model.Product;
import com.training.mystore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    /*private List<Product> myproducts=new ArrayList<>(Arrays.asList(
            new Product("iphone","001","this is latest version of apple product"),
            new Product("macpro","002","this is latest version of personal computer"),
            new Product("airpods","003","this is latest model of audio devices")));

    //get all products
    public List<Product> getAllProducts(){
        return this.myproducts;
    }

    //insert new product
    public String addProduct(Product p){
        this.myproducts.add(p);
        return "Product added succesfully";

    }

    //update specific product
    public void updateProduct(String id,Product p){
        for(int i=0;i<this.myproducts.size();i++){
            Product p1=this.myproducts.get(i);
            if(p1.getProductid().equals(id))
                this.myproducts.set(i,p);
        }
    }

    //delete specific product
    public  String deleteProduct(String id){
        this.myproducts.removeIf(product -> product.getProductid().equals(id));
        return "deleted product successfully";
    }

    //Get specific product
    public Product getSpecificProduct(String id){
        return this.myproducts.stream().filter(product->product.getProductid().equals(id)).findFirst().get();
    }*/

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public String addProduct(Product p){
        this.productRepository.save(p);
        return "Product added succesfully";
    }

    //update product
   public void updateProduct(String id,Product p){
        Optional<Product> p1=this.productRepository.findById(id);
        p.setProductid(id);
        this.productRepository.save(p);
    }

    //delete specific product
    public String deleteProduct(String id){
        this.productRepository.deleteById(id);
        return "deleted product successfully";
    }

    //Get specific product
    public Product getSpecificProduct(String id){
        return this.productRepository.findById(id).get();
    }
}