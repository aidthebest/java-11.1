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
    private Filmography fifth = new Filmography(5 , 4, "four", "horror", "non", 5);
    private Filmography sixth  = new Filmography(6 , 4, "four", "horror", "non", 5);
    private Filmography seventh  = new Filmography(7 , 4, "four", "horror", "non", 5);
    private Filmography eighth  = new Filmography(8 , 4, "four", "horror", "non", 5);
    private Filmography ninth  = new Filmography(9 , 4, "four", "horror", "non", 5);
    private Filmography tenth  = new Filmography(10 , 4, "four", "horror", "non", 5);
    private Filmography eleventh = new Filmography(11 , 4, "four", "horror", "non", 5);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void addFilm() {
        manager.add(four);
        Filmography[] actual = manager.getFilms();
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
        Filmography[] actual = manager.getFilms();
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
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Filmography[] actual = manager.getFilms();
        System.out.println("======>>" + actual.length + "<<=======");
        System.out.println("======>>" + manager.getLengthLimit() + "<<=======");
        Filmography[] expected = new Filmography[]{eleventh,tenth,ninth,eighth,seventh,sixth,fifth,four,third};
        assertArrayEquals(expected, actual);

    }

}