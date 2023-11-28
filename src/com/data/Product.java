package com.data;

public class Product {
    String name;
    Integer price;

    // override toSting method
    public String toSting(){
        return "Product name: " + this.name + ". Price: " + this.price;
    }

    // override equals methods
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Product)) return false;
        Product product = (Product) o;
        if(price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name = null;
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Product)) return false;
        Product product = (Product) o;
        if(price != product.price) return false;
        return price == product.price &&
                Object.equals(name, product.name);
    }
}
