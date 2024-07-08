
package com.product1;

import java.util.*;
public class Product1 {

    public static void main(String[] args) {
//               ProductdataImpl p = new ProductdataImpl(11,"montage", 2000);
////        System.out.println(count);
//
//         p.setname("mahmoud");
//         p.setprice(10000);
//        System.out.println("name "+p.getname()+ " , Price " +p.getprice());
////        System.out.println("Count: " + productdata.count);
        
//  }


Scanner input = new Scanner(System.in);

        System.out.println("Enter product type (normal/digital): ");
        String productType = input.nextLine().toLowerCase();

        product product;
        if (productType.equals("normal")) {
            System.out.println("Enter product weight: ");
            int weight = input.nextInt();
            input.nextLine(); // consume the newline character

            System.out.println("Enter product name: ");
            String name = input.nextLine();

            System.out.println("Enter product price: ");
            int price = input.nextInt();

            product = new ProductdataImpl(weight, name, price);
        } else if (productType.equals("digital")) {
            System.out.println("Enter product price: ");
            int price = input.nextInt();

            product = new digitalProduct(price);
        } else {
            System.out.println("Invalid product type.");
            
            return;
        }

        System.out.println(product.toString());
        
    }
}


























//System.out.println("Enter type of product (normal, digital): ");
//       Scanner input = new Scanner(System.in);
//        String productType = input.nextLine();
//
//        product product;
//
//        if (productType.equalsIgnoreCase("normal")) {
//            System.out.println("Enter product name: ");
//            
//            String name = input.nextLine();
//            System.out.println("Enter product price: ");
//            
//            int price = input.nextInt();
//            System.out.println("Enter product weight: ");
//            
//            int weight = input.nextInt();
//            product = new ProductdataImpl(weight, name, price);
//            
//        } else if (productType.equalsIgnoreCase("digital")) {
//            System.out.println("Enter digital product price: ");
//            
//            int price = input.nextInt();
//            product = new digitalProduct("digital product",price);
//            
//        } else {
//            System.out.println("Invalid product type");
//
//            return;
//        }
//
//        System.out.println(product);
//
