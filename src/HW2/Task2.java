package HW2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 543.0;
        int saleCode = 32;
        switch (saleCode){
            case 4525:
                sum *= 0.7;
                System.out.println(sum);
                break;
            case 6424:
            case 7012:
                sum *= 0.8;
                System.out.println(sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum *= 0.9;
                System.out.println(sum);
                break;
            default:
                System.out.println(sum);
        }
    }
}
