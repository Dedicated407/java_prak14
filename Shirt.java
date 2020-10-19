package ikbo.prak14;

public class Shirt {
    String id;
    String name;
    String color;
    String size;

    Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Shirt(\n\t" +
                "id: " + id +
                ",\n\ttype: " + name +
                ",\n\tcolor: " + color +
                ",\n\tsize: " + size + "\n)";
    }
}

/*
* Задание 3. (30%)
Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
Дан также строковый массив: shirts[0] = "S001,Black Polo Shirt,Black,XL";
shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL";
shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S";
shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
Преобразуйте строковый массив в массив класса Shirt и выведите его на консоль.\


Для тестов:
S001,Black Polo Shirt,Black,XL
S002,Black Polo Shirt,Black,L
S003,Blue Polo Shirt,Blue,XL
S004,Blue Polo Shirt,Blue,M
S005,Tan Polo Shirt,Tan,XL
S006,Black T-Shirt,Black,XL
S007,White T-Shirt,White,XL
S008,White T-Shirt,White,L
S009,Green T-Shirt,Green,S
S010,Orange T-Shirt,Orange,S
S011,Maroon Polo Shirt,Maroon,S
*/