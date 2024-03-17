package JavaSouls;

import java.util.Arrays;

public class Bag {
    private String[] winItems = new String[] {"Firewood", "Water","Food"};

    private String[] items;
    private int itemCount;

    public Bag(int size) {
        this.items = new String[3];
        this.itemCount = 0;
    }

    public void addItem(String item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public boolean hasItem(String item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAllItems() {
        return itemCount == items.length;
    }
    public void itemCheck(){
        System.out.println(Arrays.toString(items));

    }
    public boolean winCheck(){
        Arrays.sort(winItems);
        Arrays.sort(items);
        return winItems == items;
    }
}
