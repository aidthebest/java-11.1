package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Filmography;
import ru.netology.manager.ItemManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ItemManagerTest {
    private ItemManager manager = new ItemManager();
    private Filmography first = new Filmography(1, 1, "first", "drame", "non", 1);
    private Filmography second = new Filmography(2, 2, "second", "comedy", "non", 1);
    private Filmography third = new Filmography(3, 3, "third", "horror", "non", 1);

    private Filmography four = new Filmography(4 , 4, "four", "horror", "non", 5);
    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void addFilm() {
        manager.add(four);
        Filmography[] actual = manager.getAll();
        Filmography[] expected = new Filmography[]{four, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllFilms() {
        manager.add(four);
        Filmography[] actual = manager.getTen();
        Filmography[] expected = new Filmography[]{four, third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void showTenFilms() {
        ItemManager manager = new ItemManager(15);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        Filmography[] actual = manager.getTen();
        Filmography[] expected = new Filmography[]{four, third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void showTenFilms3() {
        ItemManager manager = new ItemManager(9);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(four);
        manager.add(four);
        manager.add(four);
        manager.add(four);
        manager.add(four);
        manager.add(four);
        manager.add(four);

        Filmography[] actual = manager.getTen();
        Filmography[] expected = new Filmography[]{four,four,four,four,four,four,four,third, second, first};
        assertArrayEquals(expected, actual);

    }

}