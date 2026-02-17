package ru.netology.javaqa.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ManagetFilmItemTest {

    @Test
    public void shouldShowListFilmsByDefault() {
        ManagerFilmItem manager = new ManagerFilmItem();

        String[] expected = {};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        ManagerFilmItem manager = new ManagerFilmItem();

        manager.addFilms("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms() {
        ManagerFilmItem manager = new ManagerFilmItem();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-невидимка");


        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilms() {
        ManagerFilmItem manager = new ManagerFilmItem();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-невидимка");

        //manager.findLastFilms();

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastThreeFilms() {
        ManagerFilmItem manager = new ManagerFilmItem(3);

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFilmsDownLimit() {
        ManagerFilmItem manager = new ManagerFilmItem(3);

        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
