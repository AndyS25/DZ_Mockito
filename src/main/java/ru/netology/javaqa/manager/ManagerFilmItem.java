package ru.netology.javaqa.manager;

public class ManagerFilmItem {
    private String[] films = new String[0];
    private int limit;

    public ManagerFilmItem() {
        this.limit = 5;
    }

    public ManagerFilmItem(int sizeLimit) {
        this.limit = sizeLimit;
    }

    public void addFilms(String item) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;
    }

    public String[] findAllFilms() {
        return films;
    }

    public String[] findLastFilms() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
