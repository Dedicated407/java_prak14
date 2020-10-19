package ikbo.prak14;

public class PhoneNumber {
    private String number;

    PhoneNumber(String number) {
        this.number = number;
    }

    public StringBuffer print() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int pos = 0; pos < number.length(); pos++) {
            if (pos == (number.length() - 7) || pos == (number.length() - 4))
                stringBuffer.append("-");
            stringBuffer.append(number.charAt(pos));
        }
        return stringBuffer;
    }
}

/*
* Задание 4. (30%)
Разработайте класс, который получает строковое представление телефонного номера в одном из двух возможных строковых форматов:
+<Код страны><Номер 10 цифр>, например “+79175655655” или
“+104289652211” или
8<Номер 10 цифр> для России, например “89175655655”
и преобразует полученную строку в формат:
+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
*/