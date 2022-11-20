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
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }





















    }
}