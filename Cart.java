package collections.shoppingcart;


import java.util.ArrayList;
import java.util.List;

class Cart {

    List<Product> cartItems = new ArrayList<Product>();
    //addProductToCartByPID
    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
    }
    //getProductByProductID
    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }
    //addToCart
    private void addToCart(Product product) {
        cartItems.add(product);
    }
    //removeProductByPID
    public void removeProductByPID(int pid) {
        Product prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }
    //printCartItems
    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }

}