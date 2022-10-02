package HW4;

public class lesson4Test {
    public static void main(String[] args) {

        //Java – Метод replaceAll()
        //метод позволяет заменить слово в строке, или буквы или цифры
        //чувствителен к регистру
        String vernut = "Добро пожаловать в тест";
        String result = vernut.replaceAll("Добро пожаловать", "Ты снова пожаловал");
        System.out.println(result);//Ты снова пожаловал в тест

        vernut = "123 привет 19328 программа";
        result = vernut.replaceAll("[0-9]", "");
        System.out.println(result); // привет  программа

        result = vernut.replaceAll("[а-яА-Я]+", "Кони"); //именно в плюсом работает
        System.out.println(result); //123 Кони 19328 Кони

        result = vernut.replaceAll("(.*)19328(.*)", "ну как то так");
        System.out.println(result); //ну как то так


        //Java replaceFirst()
        //возвращает результирующую строку, первое вхождение строки

        vernut = "Добро пожаловать! Добро пожаловать";
        result = vernut.replaceFirst("Добро пожаловать!", "Снова");
        System.out.println(result); //Снова Добро пожаловать

        result = vernut.replaceFirst("(.*)пожаловать(.*)", "ну как то так");
        System.out.println(result); //ну как то так


        //contains
        //метод чтобы проверить, содержит ли String указанную последовательность символов
        //возвращает true или false возвращает логический тип данных

        String tip = "Привет как твои дела, лучше и лучше пес";
        boolean ver = tip.contains("лучше");
        System.out.println(ver);// true
        System.out.println("вернуть как бы хеш функцию: " + tip.hashCode()); //вернуть как бы хеш функцию: -241763857


        //startsWith
        //возвращает значение true, если последовательность символов, представленного аргумента является префиксом последовательности символов, представляемой данной строкой;
        //в противном случае значение false.

        tip = "     Привет как твои дела, лучше и лучше пес   ";
        System.out.println(tip.startsWith("и", 2)); // счет начинается с нуля


        //endsWith
        //тут наверное на что заканчивается
        //булевое выражение

        boolean car = tip.endsWith("пес");
        System.out.println("есть ли это слово в конце " + car);


        //trim
        //позволяет удалить пробелы в начале и конце строки

        System.out.println(tip);
        System.out.println(tip.trim()); //Привет как твои дела, лучше и лучше пес

        //strip
        //Этот метод убирает все пробелы, находящиеся до первого не-пробела и после последнего
        //появился в 11 версии
        //метод предпочтительнее, если Вы хотите отсечь не только пробелы, но и вообще все невидимые символы.

        System.out.println(tip);
        System.out.println(tip.strip());

        //stripIndent
        //появился в java 15
        //удаляет общие пробельные символы в начале всех линий
        //по сути удаляет тоже пробелы только уже во всех строках вначале и вконце

        tip = "   привет      привет     ";
        vernut = "     стоп    ";
        System.out.println(tip.stripIndent());
        System.out.println(vernut.stripIndent());

        //stripLeading
        //удаляет все пробелы только в начале строки

        System.out.println(tip);
        System.out.println(tip.stripLeading());


        //stripTrailing
        // удаляет пробелы в конце строки

        System.out.println("#" + tip.stripTrailing() + "#");

        //compareTo
        //для Int
        //сравнивает числовой объект, который вызывает метод, с аргументом.
        //должны быть одного типа
        //Если Integer равно аргументу, то возвращается 0.
        //Если Integer меньше, чем аргумент, то возвращается -1.
        //Если Integer больше, чем аргумент, то возвращается 1.
        //для String
        //Для упорядочивания объектов одного типа, хранящихся в массиве или коллекции
        //Первый: метод сравнивает строку с другим объектом
        //второй: метод лексически сравнивает две строки.

        Integer x = 10;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(10));
        System.out.println(x.compareTo(8));

        String str1 = "задор";
        String str2 = "зодир";
        String str3 = "задор";

        int resul = str1.compareTo(str2);
        System.out.println(resul);

        resul = str2.compareTo(str3);
        System.out.println(resul);

        resul = str3.compareTo(str1);
        System.out.println(resul);


        //charAt
        //возвращает символ из массива строки по указанному индексу
        String s = "Снова в путь";
        char result1 = s.charAt(3);
        char result2 = s.charAt(11);
        System.out.println("Третий символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);

        //compareToIgnoreCase
        //сравнивает лексически две строки, игнорируя регистр букв
        //возвращает отрицательное целое число, ноль или положительное целое число,
        // если заданная строка меньше, равна или больше сравниваемой строки, игнорируя регистр

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str3.compareToIgnoreCase(str1));


        //isBlank
        //проверяет, есть-ли в строке пробел, пустая строка ("") или значение null
        //возвращает true только если в строке есть только пробел(-ы)!!! (и нет других символов) или строка пустая ("") или имеет значение null
        //удаляет белые пробелы
        String string = "     Привет";
        String string1 = "";
        String string2 = "Привет     ";
        System.out.println(string.isBlank()); //false
        System.out.println(string1.isBlank());//true
        System.out.println(string2.isBlank()); //false

        //isEmpty
        //проверяет, является ли строка пустой ("") или значение null
        //возвращает true только если строка абсолютно!!! пустая ("") или имеет значение null
        //только пустые строки
        System.out.println(string.isEmpty()); //false
        System.out.println(string1.isEmpty()); //false
        System.out.println(string2.isEmpty()); //false


        //repeat
        //string.repeat(count);
        //повтор строк без использования цикла
        String string4 = "Привет! ";
        int count=5;
        System.out.println(string4.repeat(count));

        //toLowerCase
        //делает все буквы в строке строчными
        String stre = "DSDAD";
        System.out.println(stre.toLowerCase());

        //toUpperCase
        //делает все буквы в строке заглавными
        stre = "njsdf";
        System.out.println(stre.toUpperCase());

    }
}
