package com.training.mystore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private  String productid;
    private String productname;

    private  String productdescription;

    public Product(String productname, String productid, String productdescription) {
        this.productname = productname;
        this.productid = productid;
        this.productdescription = productdescription;
    }

    public Product( ) {
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }
}
