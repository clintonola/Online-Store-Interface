package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;


public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }
    //Store items
    public void initStoreItems() {
        String [] productNames = {"Gaming Chair", "Table", "Bed" , "Lights"};
        Double [] productPrice = {99.99, 149.99, 199.99, 19.99};
        Integer [] stock = {10 ,6, 10, 20};
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}