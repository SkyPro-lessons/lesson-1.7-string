package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String fullName = task1();
        task2(fullName);
        task3();
        task4();
        task5();
        task6();
        task7();
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
        String fullNameCorrect = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameCorrect);
        System.out.println();
    }

    /** Задание 4*
     * К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
     * В качестве исходных данных используйте:
     *      Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
     *      строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
     *      переменная firstName — для хранения имени;
     *      переменная middleName — для хранения отчества;
     *      переменная lastName — для хранения фамилии.
     * Решите задание с помощью метода substring().
     * Результат программы выведите в формате:
     *      “Имя сотрудника — …”
     *      “Фамилия сотрудника — …”
     *      “Отчество сотрудника — ...”
     * Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
     * Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
     */
    public static void task4() {
        System.out.println("Task 4*");
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
        System.out.println();
    }

    /** Задание 5*
     * Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
     * Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
     * В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
     * Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
     */
    public static void task5() {
        System.out.println("Task 5*");
        String fullName = "ivanov ivan ivanovich";
        char[] fullNameCharList = fullName.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fullNameCharList.length; i++) {
            if (i == 0 || fullNameCharList[i-1] == ' ') {
                fullNameCharList[i] = Character.toUpperCase(fullNameCharList[i]);
            }
            sb.append(fullNameCharList[i]);
        }
        fullName = sb.toString();
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв - " + fullName);
        System.out.println();
    }

    /** Задание 6*
     * Имеется две строки.
     *      Первая: "135"
     *      Вторая: "246"
     * Соберите из двух строк одну, содержащую данные "123456".
     * Использовать сортировку нельзя.
     * Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
     * Выведите результат в консоль в формате: “Данные строки — ….”
     */
    public static void task6() {
        System.out.println("Task 6*");
        String firstString = "135";
        char[] firstStringCharList = firstString.toCharArray();
        String secondString = "246";
        char[] secondStringCharList = secondString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            sb.append(firstStringCharList[i]);
            sb.append(secondStringCharList[i]);
        }
        System.out.println("Данные строке - " + sb.toString());
        System.out.println();
    }

    /** Задание 7*
     * Дана строка из букв английского алфавита "aabccddefgghiijjkk".
     * Нужно найти и напечатать буквы, которые дублируются в строке.
     * Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
     * В итоге в консоль должен быть выведен результат программы: "acdgijk".
     */
    public static void task7() {
        System.out.println("Task 7*");
        String letters = "aabccddefgghiijjkk";
        char[] lettersCharList = letters.toCharArray();
        for (int i = 1; i < lettersCharList.length; i++) {
            if (lettersCharList[i] == lettersCharList[i-1]) {
                System.out.print(lettersCharList[i]);
            }
        }
        System.out.println();
    }
}
