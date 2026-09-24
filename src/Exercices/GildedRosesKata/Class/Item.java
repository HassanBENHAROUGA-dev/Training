package Exercices.GildedRosesKata.Class;

public class Item {

    public ItemType type;

    public int sellIn;

    public int quality;

    public Item(ItemType name, int sellIn, int quality) {
        this.type = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.type + ", " + this.sellIn + ", " + this.quality;
    }
}