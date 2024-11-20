package org.example;

public class ClothingFactory {
    abstract class clothingItem {
        String color;
        String style;
        String type;

        String itemDescription(){
            return STR."This \{type} is \{style} and \{color}";
        }
    }

    abstract class Top extends clothingItem {
        public Top() {
            this.type = "Top";
        }
    }

    abstract class Bottom extends clothingItem {
        public Bottom() {
            this.type = "Bottom";
        }
    }

    abstract class Shoes extends clothingItem {
        public Shoes() {
            this.type = "Shoes";
        }
    }

    Shoes shoes;Top top; Bottom bottom;
}
