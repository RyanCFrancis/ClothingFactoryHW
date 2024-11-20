package org.example;

public class Main {
    public static void main(String[] args) {

        ClothingFactory.Top fancyTop = new FancyClothingFactory("red").top;
        ClothingFactory.Bottom fancyPants = new FancyClothingFactory("green").bottom;
        ClothingFactory.Shoes sandals = new CasualClothingFactory("blue").shoes;

        System.out.println(fancyTop.itemDescription());
        System.out.println(fancyPants.itemDescription());
        System.out.println(sandals.itemDescription());
        System.out.println("This outfit doesnt match!");
    }
}