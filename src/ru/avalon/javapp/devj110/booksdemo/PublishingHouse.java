package ru.avalon.javapp.devj110.booksdemo;

public class PublishingHouse {
    private String title;
    private String nameCity;

    public PublishingHouse(String title, String nameCity) {
        setTitle(title);
        setNameCity(nameCity);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("title should not be an empty link");

        this.title = title;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        if (nameCity == null)
            throw new IllegalArgumentException("nameCity should not be an empty link");

        this.nameCity = nameCity;
    }

    @Override
    public String toString() {
        return title + ", " + nameCity;
    }
}
