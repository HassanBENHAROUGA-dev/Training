package Exercices.GildedRosesKata.Class;

import java.util.Map;

public class GildedRose {
private final Map<ItemType, ItemStrategy> strategyMap;
    Item[] items;

    public GildedRose(Item[] items, Map<ItemType, ItemStrategy>  roseService) {
        this.items = items;
        this.strategyMap = Map.of(
                ItemType.AGED_BRIE, new AgedBrie(),
                ItemType.SULFURAS, new SulfurasItem(),
                ItemType.BACKSTAGE_PASSES, new BackstagePasses(),
                ItemType.DEFAULT, new DefaultItem()
        );
    }

    public void updateQuality(String methodName) {
        for(Item item: items){
            ItemType itemType = item.type;
            ItemStrategy strategy =
                    strategyMap.getOrDefault(itemType, strategyMap.get(ItemType.DEFAULT));
            strategy.updateItem(item);
        }
    }

}