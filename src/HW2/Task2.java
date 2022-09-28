package HW2;
/*
Задача на SWITCH

Дана переменная sum - сумма покупки и переменна saleCode - номер купона.

Если номер купона равен 4525 - вывести сумму с учетом скидки 30%
Если номер купона равен 6424 или 7012 - вывести сумму с учетом скидки 20%
Если номер купона равен 7647 или 9011 или 6612 - вывести сумму с учетом скидки 10%
В остальных случаях скидка не предусмотрена, вывесть полную стоимость покупки.
 */
public class Task2 {
    public static void main(String[] args) {
        double sum = 4000;
        int saleCode = 7012;
        switch (saleCode){
            case 4525:
                sum *= 0.7;
                //System.out.println(sum);
                break;
            case 6424:
            case 7012:
                sum *= 0.8;
                //System.out.println(sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum *= 0.9;
                //System.out.println(sum);
                break;
            //default:
                //System.out.println(sum);
        }System.out.println(sum);
    }
}
