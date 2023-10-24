import src.Product;
import src.ProductManager;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
    Product product1 = new Product("Iphone XS","XS",10000.0);
    Product product2 = new Product("SamSung Flip","SSF",12000.0);
    Product product3 = new Product("Oppo","OP",100000.0);
    Product product4 = new Product("Oppo Z","OP2",300000.0);
        ProductManager lists = new ProductManager();
        lists.addProduct(product1);
        lists.addProduct(product2);
        lists.addProduct(product3);
        lists.addProduct(product4);
        System.out.println("---Sắp xếp giảm dần: ");
        lists.sortByProductPrice();
        lists.ReaddProduct();
        System.out.println("---Sắp xếp tăng dần: ");
        lists.sortByProduct();
        lists.ReaddProduct();


    }
}
