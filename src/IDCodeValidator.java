/**
 * Класс для проверки эстонских личных кодов (ID code).
 */
public class IDCodeValidator {

    /**
     * Проверяет, является ли данный ID code допустимым.
     * Использует все остальные методы для проверки
     *
     * @param idCode строка, представляющая ID code
     * @return {@code true}, если ID code допустим, иначе {@code false}
     */
    public static boolean isCorrect(String idCode) {
        return false;
    }

    /**
     * Проверяет корректность кода пола в ID code.
     *
     * @param genderNumber целое число, представляющее код пола
     * @return {@code true}, если код пола корректен, иначе {@code false}
     */
    public static boolean isGenderNumberCorrect(int genderNumber) {
        return false;
    }


    /**
     * Проверяет корректность номера месяца рождения в ID code.
     *
     * @param dayNumber целое число, представляющее номер месяца
     * @return {@code true}, если номер дня корректен, иначе {@code false}
     */
    public static boolean isDayNumberCorrect(int dayNumber) {
        return false;
    }

    /**
     * Проверяет корректность номера месяца рождения в ID code.
     *
     * @param monthNumber целое число, представляющее номер месяца
     * @return {@code true}, если номер месяца корректен, иначе {@code false}
     */
    public static boolean isMonthNumberCorrect(int monthNumber) {
        return false;
    }


    /**
     * Проверяет корректность даты рождения в ID code.
     * @param yearNumber  целое число, представляющее год рождения (1955, 1999, 2013)
     * @param monthNumber целое число, представляющее номер месяца (1, 8)
     * @param dayNumber   целое число, представляющее номер дня (15, 31)
     * @return {@code true}, если номер дня корректен, иначе {@code false}
     */
    public static boolean isBirthDateCorrect(int yearNumber, int monthNumber, int dayNumber) {
        return false;
    }

    /**
     * Проверяет, является ли данный год високосным.
     *
     * @param yearNumber целое число, представляющее год
     * @return {@code true}, если год високосный, иначе {@code false}
     */
    public static boolean isLeapYear(int yearNumber) {
        return false;
    }

    /**
     * Проверяет корректность контрольной суммы в ID code.
     *
     * @param idCode строка, представляющая ID code
     * @return {@code true}, если контрольная сумма корректна, иначе {@code false}
     */
    public static boolean checkControlNumber(String idCode) {
        return false;
    }

    /**
     * Метод, для получения информаций из ИД кода
     * Используйте данный формат - This is a (gender) born on (DD.MM.YYYY).
     * Gender в качестве ENUM
     *
     * @param idCode строка, представляющая ID code
     * @return Строка, в которой написан пол и дата рождения человека
     */
    public static String getInformation(String idCode) {
        return "";
    }

    /**
     * Верните пол человека
     *
     * @param genderNumber The gender number from the ID code.
     * @return The gender as a string ("male" or "female").
     */
    public static Gender getGender(int genderNumber) {
        return null;
    }

    /**
     * Верните год, когда человек родился (1955, 2014)
     *
     * @param genderNumber The gender number from the ID code.
     * @param year         The two last digits of the birth year from the ID code.
     * @return The full 4-digit birth year.
     */
    public static int getFullYear(int genderNumber, int year) {
        return 0;
    }

}
