package Seminar03_HW;

import static Seminar03_HW.Input.inputFromConsole;

public class Check {


    static void checkElements(Record record) {
        /**
         * Проверка на наличие двойных пробелов
         */
        for (int i=1; i<Record.str.length(); i++){
            if (Record.str.charAt(i)==' ' && Record.str.charAt(i-1)==' '){
                System.out.println("Вы некорректно ввели данные.");
                System.out.println("Пожалуйста повторите ввод, используя только один пробел между элементами");
                System.out.println();
                Program.main(null);
            }
        }

        /**
         * Проверка наличия всей информации
         */
        int countSpace=0;
        for (int i=0; i<Record.str.length(); i++){
            if (Record.str.charAt(i)==' '){
                countSpace++;
            }
        }
        if (countSpace!=5){
            System.out.println("Вы некорректно ввели данные.");
            System.out.println("Пожалуйста введите ВСЮ необходимую информацию.");
            System.out.println();
            Program.main(null);
        }
    }

    /**
     * Проверка правильности формата вводимого элемента Дата Рождения
     * @param birthDay
     */
    public static void checkBirhday(String birthDay) {
        if (!birthDay.matches("\\d{2}.\\d{2}.\\d{4}")){
            try {
                throw new Exception("Неверный формат даты рождения: ");
            } catch (Exception e) {
                System.out.println(e.getMessage() + birthDay);
                System.out.println("Введите всю информацию снова.");
                Program.main(null);
            }
        }
    }

    /**
     * Проверка правильности формата вводимого элемента Телефонный Номер
     * @param telephoneNumber
     */
    public static void checkTelephoneNumber (String telephoneNumber){
        //if (telephoneNumber instanceof Integer)
        if (!telephoneNumber.matches("\\d+")) {
            try{
                throw new Exception("Неверный формат телефонного номера: ");
            }catch (Exception e){
                System.out.println(e.getMessage() + telephoneNumber);
                System.out.println("Введите всю информацию снова.");
                Program.main(null);
            }
        }
    }

    /**
     * Проверка правильности формата вводимого элемента Пол
     * @param sex
     */
    public static void checkSex(String sex){
        if (!sex.matches("[fm]")) {
            try{
                throw new Exception("Неверный формат пола: ");
            }catch (Exception e){
                System.out.println(e.getMessage() + sex);
                System.out.println("Введите всю информацию снова.");
                Program.main(null);
            }
        }
    }



}
