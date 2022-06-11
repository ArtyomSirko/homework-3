public class Main {

    public static void main(String[] args) {
        int clientOS = 1;                   //задача 1
        int clientDeviceYear = 2014;      //задача 2
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("страница браузера");
        }


        int year = 500;   // 3 задача
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год высокосный");
        } else {
            System.out.println(year + " год не высокосный");
        }


        int deliveryDistance = 847;  //4 задача
        int days = (deliveryDistance + 20) / 40 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Срок достаки один день");
        } else {
            System.out.println("Срок доставки " + days + " дней");

            int monthNumber = 1;   //5 задача
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осений месяц");
                    break;
                default:
                    System.out.println("нет такого месяца");
            }
        }
    }
}
