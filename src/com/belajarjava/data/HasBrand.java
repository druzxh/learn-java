package com.belajarjava.data;

public interface HasBrand {
    String getBrand();
    // Default method

    default boolean isBig(){
        return false;
    }
}
