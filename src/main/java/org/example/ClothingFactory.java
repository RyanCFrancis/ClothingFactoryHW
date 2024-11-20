package org.example;

public class ClothingFactory {
    //abstract clothnig item with a type, style and item color
    abstract class clothingItem {
        String color;
        String style;
        String type;

        String itemDescription(){
            return STR."This \{type} is \{style} and \{color}";
        }
    }

    class Top extends clothingItem {
        public Top() {
            this.type = "Top";
        }
    }

    class Bottom extends clothingItem {
        public Bottom() {
            this.type = "Bottom";
        }
    }

    class Shoes extends clothingItem {
        public Shoes() {
            this.type = "Shoes";
        }
    }

    Shoes shoes;Top top; Bottom bottom;

    public ClothingFactory(String c) {
        this.shoes = new Shoes();
        this.top = new Top();
        this.bottom = new Bottom();
        this.shoes.color = c;
        this.top.color = c;
        this.bottom.color = c;
    }
}
