package ru.netology.manager;

import ru.netology.domain.Filmography;

public class ItemManager {
    private Filmography[] items = new Filmography[0];

    public void setLengthLimit(int lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    private int lengthLimit = 10;

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
        int resultLength;
        if (lengthLimit >= 10){
            resultLength=10;
        } else {
            resultLength = lengthLimit;
        }
        Filmography[] result = new Filmography[items.length];
        for (int i = 0; i < result.length ; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

//      ??? resultLength;
//  if ??? {
//        resultLength = ???
//    } else {
//        resultLength = ???
//    }
//  ??? result = new ???[resultLength];
//  for (???) {
//        // заполняем result из массива что лежит в поле
//        // в обратном порядке
//    }
}