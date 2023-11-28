package com.belajarjava.data;
public class Avanza implements Car {
    public void drive(){
        System.out.println("Car driving");
    }
    public int getTire(){
        return 4;
    }
    public String getBrand() {
        return "Toyota";
    }
    public static void main(String[] args) {
    }
}
