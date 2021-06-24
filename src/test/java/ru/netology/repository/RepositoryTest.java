package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmRepo;
import ru.netology.domain.Filmography;

public class RepositoryTest {
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


    @Test
    public void shouldAdd() {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);

        Filmography[] expected = {fifth, second, tenth};
        Filmography[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById () {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);
        repo.save(eleventh);

        repo.removeById(10);
        Filmography[] expected = {fifth, second, eleventh};
        Filmography[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdNotExist () {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);
        repo.save(eleventh);

        repo.removeById(16);
        Filmography[] expected = {fifth, second, tenth, eleventh};
        Filmography[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll () {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);
        repo.save(eleventh);

        repo.removeAll();
        Filmography[] expected = {};
        Filmography[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll () {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);
        repo.save(eleventh);
        repo.save(third);

        repo.findAll();
        Filmography[] expected = {fifth, second, tenth, eleventh, third};
        Filmography[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById () {
        FilmRepo repo = new FilmRepo();
        repo.save(fifth);
        repo.save(second);
        repo.save(tenth);
        repo.save(eleventh);
        repo.save(third);


        Filmography expected = second;
        Filmography actual = repo.findById(2);
        Assertions.assertEquals(expected, actual);
    }
}

