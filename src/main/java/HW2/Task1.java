/*
1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных
*/

package HW2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float userInput = readFloatFromUser();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float userInput = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");

            try {
                userInput = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введено некорректное значение. Пожалуйста, повторите ввод.");
            }
        }

        return userInput;
    }
}