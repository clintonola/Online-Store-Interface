package collections.shoppingcart;

import java.util.Objects;

//Products
class Product {
    private Integer pid;
    private String name;
    private Double price;
    private Integer stock;

    public Product () {
    }

    public Product (Integer pid, String name, Double price, Integer stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //return name
    public String getName() {
        return name;
    }

    //Setname
    public void setName(String name) {
        this.name = name;
    }

    //Return price
    public Double getPrice() {
        return price;
    }

    //Setprice
    public void setPrice(Double price) {
        this.price = price;
    }

    //Return the stock
    public Integer getStock() {
        return stock;
    }

    //Set the stock
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    //Return the PID
    public Integer getPid() {
        return pid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pid);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        return true;
    }

    //set the PID
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}