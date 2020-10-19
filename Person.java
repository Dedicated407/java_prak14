package ikbo.prak14;

public class Person {
    private String surname;
    private String name;
    private String middle_name;

    Person(String surname, String name, String middle_name) {
        this.surname = surname;
        this.name = name;
        this.middle_name = middle_name;
    }

    Person(String surname) {
        this.surname = surname;
        name = null;
        middle_name = null;
    }

    public StringBuffer getAll() {
        StringBuffer str = new StringBuffer();
        if (name != null || middle_name != null)
            str.append(surname).append(" ").append(String.format("%.1s",name)).append(".").append(String.format("%.1s",middle_name)).append(".");
        else
            str.append(surname);
        return str;
    }
}
/*
* Задание 1. (10%)
Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О.
Функция должна учитывать возможность отсутствия значений в полях Имя и Отчество.
Программу оптимизировать с точки зрения быстродействия.
 */