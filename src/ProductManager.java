package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private ArrayList<Product> list;

    public ProductManager(){
        this.list = new ArrayList<>();
    }

    public void addProduct(Product data){
        boolean isPresent = false;
        for(Product p : list){
            if (p.getId().equals(data.getId())){
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            this.list.add(data);
        }
    }
    public void removeProduct(String data){
        for (Product p : list){
            if (p.getId().equals(data)){
                this.list.remove(p);
            }
        }
    }



    public void ReaddProduct(){
        int i = 1;
       for (Product p : list){
           System.out.println( "product" + i + "-" + p);
           i++;
       }
    }
    public void sortByProductPrice(){
        Collections.sort(list,Product.ProductPrice);
    }

    public void sortByProduct(){
        Collections.sort(list);
    }

}
