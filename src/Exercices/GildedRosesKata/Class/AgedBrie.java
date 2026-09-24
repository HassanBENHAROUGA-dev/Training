package Exercices.GildedRosesKata.Class;

public class AgedBrie implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
        }
        if (item.quality < 50 && item.sellIn < 0) {
            item.quality++;
        }
    }
}
