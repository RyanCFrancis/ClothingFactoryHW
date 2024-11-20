package org.example;

public class FancyClothingFactory extends ClothingFactory{

    //creates fancy clothes
    public FancyClothingFactory(String c) {
        super(c);
        super.top.style = "fancy";
        super.bottom.style = "fancy";
        super.shoes.style = "fancy";
    }
}
