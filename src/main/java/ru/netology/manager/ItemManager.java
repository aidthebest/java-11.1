package ru.netology.manager;

import ru.netology.domain.FilmRepo;
import ru.netology.domain.Filmography;

public class ItemManager {
    private FilmRepo repository = new FilmRepo();

    public ItemManager(FilmRepo repo) {
        repository = repo;
    }

    public void add(Filmography item) {
        repository.save(item);
    }

    public Filmography[] getAll() {
        return repository.findAll();
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    private int lengthLimit = 10;

    public ItemManager() {
    }

    public ItemManager(int lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    public int getLengthLimit() {
        return this.lengthLimit;
    }

    public Filmography[] getFilms() {
        Filmography[] items = repository.findAll();
        int resultCount = ((items.length <= lengthLimit) ? items.length : lengthLimit);
        Filmography[] result = new Filmography[resultCount];
        for (int i = 0; i < resultCount; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}