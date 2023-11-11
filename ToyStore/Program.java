package ToyStore;

import java.util.Scanner;

public class Program {
    private static ToyStore toyStore;
    private static Scanner scanner;

    public static void Menu() {
        toyStore = new ToyStore();
        scanner = new Scanner(System.in);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            toyStore.saveToys();
            System.out.println("Программа завершена. Данные сохранены.");
        }));
        run();
    }

    public static void run() {
        while (true) {
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Удалить игрушку");
            System.out.println("4. Информация о всех игрушках");
            System.out.println("5. Розыгрыш игрушек");
            System.out.println("6. Выход");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите порядковый номер игрушки: ");
                    int toyId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите название игрушки: ");
                    String toyName = scanner.nextLine();
                    System.out.print("Введите вес игрушки: ");
                    int toyWeight = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите количество игрушек: ");
                    int toyQuantity = scanner.nextInt();
                    scanner.nextLine();
                    toyStore.addToy(new Toy(toyId, toyName, toyWeight, toyQuantity));
                    System.out.println("Игрушка успешно добавлена.");
                    break;
                case 2:
                    System.out.print("Введите порядковый номер игрушки, вес которой нужно изменить: ");
                    int updateToyId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите новый вес игрушки: ");
                    int newWeight = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        toyStore.updateToyWeight(updateToyId, newWeight);
                        System.out.println("Вес игрушки успешно изменен.");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Введите порядковый номер игрушки, которую нужно удалить: ");
                    int removeToyId = scanner.nextInt();
                    scanner.nextLine();
                    toyStore.removeToy(removeToyId);
                    System.out.println("Игрушка успешно удалена.");
                    break;
                case 4:
                    System.out.println(toyStore.getToysInfo());
                    break;
                case 5:
                    System.out.print("Введите количество игрушек для розыгрыша: ");
                    int drawCount = scanner.nextInt();
                    scanner.nextLine();
                    toyStore.drawToys(drawCount);
                    break;
                case 6:
                    System.out.println("Выход из приложения.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}