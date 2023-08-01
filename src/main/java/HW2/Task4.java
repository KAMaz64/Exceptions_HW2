/*
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/


package HW2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        try {
            String input = readNonEmptyStringFromUser();
            System.out.println("Вы ввели: " + input);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readNonEmptyStringFromUser() throws EmptyInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new EmptyInputException("Пустые строки вводить нельзя.");
        }

        return input;
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException(String message) {
        super(message);
    }
}
