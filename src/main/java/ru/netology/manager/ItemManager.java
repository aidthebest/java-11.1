package ru.netology.manager;

import ru.netology.domain.Filmography;

public class ItemManager {
    private Filmography[] items = new Filmography[0];
    private  int lengthLimit = 10;

    public ItemManager() {
    }

    public int getLengthLimit(){
        return this.lengthLimit;
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

    public Filmography[] getFilms() {
        int resultCount=((items.length<=lengthLimit)? items.length : lengthLimit);
        Filmography[] result = new Filmography[resultCount];
        for (int i = 0; i < resultCount; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}