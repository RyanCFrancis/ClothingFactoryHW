package org.example;

public class CasualClothingFactory extends ClothingFactory{

    public CasualClothingFactory(String c) {
        super(c);
        super.top.style = "casual";
        super.bottom.style = "casual";
        super.shoes.style = "casual";
    }
}
