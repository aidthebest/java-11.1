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

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

//    @Test
//    public void shouldRemoveIfExists() {
//        int idToRemove = 1;
//        manager.removeById(idToRemove);
//
//        Filmography[] actual = manager.getAll();
//        Filmography[] expected = new Filmography[]{third, second};
//
////    assertEquals(expected, actual);
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldNotRemoveIfNotExists() {
//        int idToRemove = 4;
//
//        manager.removeById(idToRemove);
//
//        PurchaseItem[] actual = manager.getAll();
//        PurchaseItem[] expected = new PurchaseItem[]{third, second, first};
//
//        assertArrayEquals(expected, actual);
//    }
}