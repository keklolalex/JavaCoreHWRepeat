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









    }
}
