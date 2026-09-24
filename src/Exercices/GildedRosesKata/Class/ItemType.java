package Exercices.GildedRosesKata.Class;

public enum ItemType {
    AGED_BRIE,
    SULFURAS,
    BACKSTAGE_PASSES,
    DEFAULT;

    public static ItemType from(String name) {
        return switch (name) {
            case "Aged Brie" -> AGED_BRIE;
            case "Sulfuras, Hand of Ragnaros" -> SULFURAS;
            case "Backstage passes to a TAFKAL80ETC concert" -> BACKSTAGE_PASSES;
            default -> DEFAULT;
        };
    }
}