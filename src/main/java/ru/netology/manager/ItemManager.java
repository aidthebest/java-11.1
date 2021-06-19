package ru.netology.manager;

import ru.netology.domain.Filmography;

public class ItemManager {
    private Filmography[] items = new Filmography[0];
    private  int lengthLimit = 10;

    public ItemManager() {
    }

    public ItemManager (int lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    public void add(Filmography item) {
        int length = items.length + 1;
        Filmography[] tmp = new Filmography[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Filmography[] getTen() {
        if (items.length > 10){
            lengthLimit = 10;
        } else {
            lengthLimit = items.length;
        }
        Filmography[] result = new Filmography[lengthLimit];
        for (int i = 0; i < result.length ; i++) {
            int index = result.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
    public Filmography[] getAll() {
        Filmography[] result = new Filmography[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

//
}