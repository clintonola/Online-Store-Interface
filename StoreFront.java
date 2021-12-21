package collections.shoppingcart;


import java.util.List;
import java.util.Scanner;


public class StoreFront {
    //object class of type of class
    Cart cart = new Cart();
    private int ch = 0;

    public StoreFront () {
        menu();
    }

    //startScreen
    public void startScreen () {
        System.out.println("\n1. Store Products");
        System.out.println("\n2. Show Cart");
        System.out.println("\n0. Exit");
    }
    //storeProductsMenu
    public void storeProductsMenu() {
        System.out.println("\n1. Add to Cart");
        System.out.println("\n2. Remove From Cart");
        System.out.println("\n0. Exit");
    }
    //create the menu
    public void menu () {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:

                break;
        }
    }
    //gettingUserInput
    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }
    //displaying Store Products
    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }
    //addProductToCart
    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }
    //showing the Cart
    private void showCart() {
        cart.printCartItems();
    }
    //remove Product From Cart
    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}