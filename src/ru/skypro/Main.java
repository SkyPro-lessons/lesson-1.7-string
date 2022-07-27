package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String fullName = task1();
        task2(fullName);
        task3();
    }

    /** Задание 1
     * Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия
     *      попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
     * Напишите четыре строки:
     *      первая с именем firstName — для хранения имени;
     *      вторая с именем middleName — для хранения отчества;
     *      третья с именем lastName — для хранения фамилии;
     *      четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
     * Выведите в консоль фразу: “ФИО сотрудника — ….”
     * В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
     * @return полное имя, составленное из частей
     */
    public static String task1() {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        return fullName;
    }

    /** Задание 2
     * Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников, полностью написанные
     *      заглавными буквами (верхним регистром).
     * Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
     * В качестве строки с исходными данными используйте строку fullName.
     * Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
     * @param fullName полное имя, которое нужно отформатировать
     */
    public static void task2(String fullName) {
        System.out.println("Task 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);
        System.out.println();
    }

    /** Задание 3
     * Система, в которой мы работаем, не принимает символ “ё”.
     * Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
     * В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
     * Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
     */
    public static void task3() {
        System.out.println("Task 3");
        String fullName = "Иванов Семён Семёнович";
        StringBuilder fullNameCorrect = new StringBuilder();
        char[] fullNameChar = fullName.toCharArray();
        for (int i = 0; i < fullNameChar.length; i++) {
            if (fullNameChar[i] == 'ё') {
                fullNameChar[i] = 'е';
            }
            fullNameCorrect.append(fullNameChar[i]);
        }
        System.out.println(fullNameCorrect);
        System.out.println();
    }
}
