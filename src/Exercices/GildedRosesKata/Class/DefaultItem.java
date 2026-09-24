package Exercices.GildedRosesKata.Class;

public class DefaultItem implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        item.sellIn--;
        if (item.quality > 0) {
                item.quality--;
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
