package ru.avalon.javapp.devj110.booksdemo;


public class Test {
    public static void main(String[] args) {

        PublishingHouse Проспект = new PublishingHouse("Проспект", "Москва");
        PublishingHouse Питер = new PublishingHouse("Питер", "Санкт-Петербург");
        PublishingHouse БХВ = new PublishingHouse("БХВ", "Санкт-Петебург");
        PublishingHouse Диалектика = new PublishingHouse("Диалектика", "Киев");

        Book book1 = new Book("Computer Science: основы программирования на Java, " +
                "ООП, алгоритмы и структуры данных", 2018,
                Питер, "Седжвик Роберт", "Уэйн Кевин");

        Book book2 = new Book("Разработка требований к программному обеспечению. 3-е издание, до- полненное",
                2019, БХВ, "Вигерс Карл");

        Book book3 = new Book("Java. Полное руководство, 10-е издание", 2018, Диалектика,
                "Шилдт Герберт");

        Book book4 = new Book("C/C++. Процедурное программирование", 2017, БХВ,
                "Полубенцева М.И.");

        Book book5 = new Book("Конституция РФ", 2020, Проспект);

        Book[] library = {book1, book2, book3, book4, book5};

        Book.printAll(library);
        System.out.println("-------------");
        БХВ.setNameCity("Санкт-Петербург");
        Book.printAll(library);

        /*
            У объекта типа PublishingHouse на который ссылыется переменная с именем "БХВ" есть поле "nameCity"
            проинициализорованное изначально конструктором значением: "Санкт-Петебург". После использования метода
            setNameCity() с аргументами : "Санкт-Петербург" на объекте, на который ссылается переменная "БХВ",
            у этого объекта значение поля "nameCity" заменяется на "Санкт-Петербург".
         */

    }
}
