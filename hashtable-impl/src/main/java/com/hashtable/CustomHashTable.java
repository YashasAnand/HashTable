package com.hashtable;

public class CustomHashTable<K, V> {
    private int capacity = 8;
    @SuppressWarnings("unchecked")
    private Item<K, V> backingArray[] = (Item<K, V>[]) new Item[capacity];

    private static class Item<K, V> {
        K key;
        V value;
        Item<K, V> nextItem;

        Item(K key, V value, Item<K, V> item) {
            this.key = key;
            this.value = value;
            this.nextItem = item;
        }
    }

    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % capacity);
        System.out.println("Key " + key + " has hashcode " + key.hashCode() +
                " L2 hashfunction mapped to value " + index);
        Item<K, V> currentHead = backingArray[index];
        if (currentHead != null) {
            System.out.println("Collision has occurred for key " + key);
        }
        backingArray[index] = new Item<>(key, value, currentHead);
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode() % capacity);
        var curr_head = backingArray[index];
        while (curr_head != null) {
            if (curr_head.key.equals(key))
                return curr_head.value;
            else
                curr_head = curr_head.nextItem;
        }
        return null;
    }
}