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


    }
}
