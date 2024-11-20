package org.example;

public class Main {
    public static void main(String[] args) {

        //factory was chosen so we can add more clothing types down the line
        //and not affect what the items have in common of previously  made clothes
        //With the factory design pattern we can in the future make clothing items for
        //different occasions like a Halloween costume or beach clothing

        ClothingFactory.Top fancyTop = new FancyClothingFactory("red").top;
        ClothingFactory.Bottom fancyPants = new FancyClothingFactory("green").bottom;
        ClothingFactory.Shoes sandals = new CasualClothingFactory("blue").shoes;

        //here we have some items decoupled from their factory
        //to show that items of different factories could be used together as needed
        //by the developer of the code
        System.out.println(fancyTop.itemDescription());
        System.out.println(fancyPants.itemDescription());
        System.out.println(sandals.itemDescription());
        System.out.println("This outfit doesnt match!");
    }
}