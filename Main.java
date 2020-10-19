package ikbo.prak14;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Задание №1");
        Person person = new Person("Цыпин");
        System.out.println(person.getAll());

        Person person1 = new Person("Цыпин", "Илья", "Павлович");
        System.out.println(person1.getAll());

        System.out.println("Задание №3");
        Scanner scanner = new Scanner(System.in);
        String[] dtmp;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            dtmp = scanner.nextLine().split(",");
            Shirt shirt = new Shirt(dtmp[0], dtmp[1], dtmp[2], dtmp[3]);
            arrayList.add(shirt);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(arrayList.get(i).toString());
        }

        System.out.println("Задание №4");
        PhoneNumber phoneNumber = new PhoneNumber("+104289652211");
        System.out.println(phoneNumber.print());

        System.out.println("Задание №5");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));

        String file_name = bufferedReader.readLine();
        Stream<String> lines = Files.lines(Paths.get(file_name));

        String[] words = lines.collect(Collectors.joining(" ")).split(" ");

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] word;
        if(words == null || words.length == 0)
            return stringBuilder;
        else
            word = words;
        stringBuilder.append(word[0]);
        for (int j = 0; j < word.length; j++) {

            for (int i = 1; i < word.length; i++) {
                if(word[i].length() != 0)
                    if(stringBuilder.toString().toLowerCase().charAt(0) == word[i].toLowerCase().charAt(word[i].length()-1)) {
                        stringBuilder.insert(0, word[i] + " ");
                        word[i] = "";
                    }
                    else if(stringBuilder.toString().toLowerCase().charAt(stringBuilder.length()-1) == word[i].toLowerCase().charAt(0)){
                        stringBuilder.append(" " + word[i]);
                        word[i] = "";
                    }
            }

        }
        return stringBuilder;
    }
}
/*
* Задание 1. (10%) +
Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О.
Функция должна учитывать возможность отсутствия значений в полях Имя и Отчество.
Программу оптимизировать с точки зрения быстродействия.


* Задание 3. (30%) -
Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
Дан также строковый массив: shirts[0] = "S001,Black Polo Shirt,Black,XL";
shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL";
shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S";
shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
Преобразуйте строковый массив в массив класса Shirt и выведите его на консоль.


* Задание 4. (30%) +
Разработайте класс, который получает строковое представление телефонного номера в одном из двух возможных строковых форматов:
+<Код страны><Номер 10 цифр>, например “+79175655655” или
“+104289652211” или
8<Номер 10 цифр> для России, например “89175655655”
и преобразует полученную строку в формат:
+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>


* Задание 5. (30%) +
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine() используя StringBuilder расставьте все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.

*/