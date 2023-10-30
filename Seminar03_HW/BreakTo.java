package Seminar03_HW;

public class BreakTo {

    public void breakTo (Record record){

        String[] parts = Record.str.split(" ");

        Record.surname = parts[0];
        Record.name = parts[1];
        Record.patronymic = parts[2];
        Record.birthDate = parts[3];

        Check.checkBirhday(Record.birthDate);

        Record.telephoneNumber=parts[4];
        Check.checkTelephoneNumber(Record.telephoneNumber);
        Record.sex = parts[5];

        Check.checkSex(Record.sex);
    }
}
