package Seminar03_HW;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static void inputFromConsole(Record record) {

        record.setStr(prompt("Введите данные в формате: Фамилия Имя Отчество Дата рождения (дд.мм.гггг) " +
                "Номер телефона Пол (латинскими буквами m или f)\n"));
    }
    private static String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}