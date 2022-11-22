public class Main {
    public static void main(String[] args) {
        int clientOS =1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("________________________________________________________________________");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println("________________________________________________________________________");
        int year = 300;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Текуший " + year + " год является високосным.");
        }else{
            System.out.println("Текуший " + year + " год не является високосным.");
            }
        System.out.println("________________________________________________________________________");
        int deliveryDistance = 180;
        int daysAmount = 1+(deliveryDistance + 19)/40;
        System.out.println("Расчетное время доставки " + daysAmount + " дней.");
        System.out.println("________________________________________________________________________");
        int monthNumber = 6;
        switch (monthNumber) {
        case 12:
        case 1:
        case 2:
        System.out.println("Сейчас зима.");
        break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень.");
                break;
        }



    }
}