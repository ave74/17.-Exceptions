package Seminar03_HW;

import java.io.FileWriter;
import java.io.IOException;

public class Save {

    static void saveTo(Record record) {
        String fileName = Record.surname + ".txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
        writer.write("<" + record.getSurname().toLowerCase() + "><" + record.getName() + "><" + record.getPatronymic() +
                "><" + record.getBirthDate() + "><" + record.getTelephoneNumber() + "><" +
                record.getSex() + ">\n");
        writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}