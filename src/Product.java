package src;

import java.util.ArrayList;
import java.util.Comparator;

public class Product implements Comparable<Product>  {
    private String name;
    private String id;
    private Double price;


    public Product() {
    }

    public Product(String name, String id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString() {
        return
                " Name: " + this.getName() + "," +
                " Id: " + this.getId() + "," +
                " Price: " + this.getPrice();

    }
    public static Comparator<Product> ProductPrice = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() < o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            }
            return -1;
        }
    };

    @Override
    public int compareTo(Product o) {
        return  this.getPrice().compareTo(o.getPrice());
    }
}
