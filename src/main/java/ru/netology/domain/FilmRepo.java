package ru.netology.domain;

public class FilmRepo {

    private Filmography[] items = new Filmography[0];

    public void save(Filmography item) {
        int length = items.length + 1;
        Filmography[] tmp = new Filmography[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Filmography[] findAll() {
        return items;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Filmography[] tmp = new Filmography[length];
        int index = 0;
        for (Filmography item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public  Filmography findById(int id) {
        for (Filmography item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeAll() {
        Filmography[] tmp = new Filmography[0];
        items = tmp;
    }

}
