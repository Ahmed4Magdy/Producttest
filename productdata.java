package com.product1;
import java.util.*;
import static com.product1.productdata.count;

public class productdata {

    String name;
    int price;
    int weight;
    static int count = 0;

    public productdata(int newweight, String newname, int newprice) {

        name = newname;
        price = newprice;
        weight = newweight;
        count++;

    }

    public int getweight() {

        return weight;

    }

    public void setweight(int weight) {

        this.weight = weight;

    }

    public String getname() {
        return name;

    }

    public void setame(String name) {
        this.name = name;

    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {

        this.price = price;
    }

//    public String toString() {
//        return "Name: " + name + ", Price: " + price;
//    }

}



interface product {

    int getweight();

    String getname();

    int getprice();
    

    void setweight(int weight);

    void setname(String name);

    void setprice(int price);

//    String toString();

}


 class ProductdataImpl implements product {

    String name;
    int price;
    int weight;
    static int count = 0;

    public ProductdataImpl(int newweight, String newname, int newprice) {

        name = newname;
        price = newprice;
        weight = newweight;
        count++;
  
    }

    public int getWeight() {

        return weight;

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public String toString() {
//        return "Name: " + name + ", Price: " + price + ", Weight: " + weight;
//    }

    

    @Override
    public int getweight() {
    return weight; 
    }

    @Override
    public String getname() {
        return name;
     }

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public void setweight(int weight) {
        this.weight=weight;
     }

    @Override
    public void setname(String name) {
        this.name=name;
     }

    @Override
    public void setprice(int price) {
        this.price=price;
    }

}



  class digitalProduct implements product{
    
     int weight;
     int price;
     String name;
     
     
    public digitalProduct(int newprice){
        name = "digital product";
        price = newprice;

        
        }

    @Override
    public int getweight() {
         return weight;
    }

    @Override
    public String getname() {
       return name;
        }

    @Override
    public int getprice() {
   
         return price;
     }

    @Override
    public void setweight(int weight) {
         this.weight=0;
     }

    @Override
    public void setname(String name) {
        this.name="digital product";
    }

    @Override
    public void setprice(int price) {
        this.price=price;
    }
        
    }
    
    
    
    
