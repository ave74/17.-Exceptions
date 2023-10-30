package Seminar03_HW;

public class Record {
    public static String str;
    public Record(String str) {
        this.str = str;
    }
    public Record() {

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static String surname;
    public static String name;
    public static String patronymic;
    public static String birthDate;
    public static String telephoneNumber;
    public static String sex;


    public Record(String surname, String name, String patronymic, String birthDate, String telephoneNumber, String sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getSex() {
        return sex;
    }
}
