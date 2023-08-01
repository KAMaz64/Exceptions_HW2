package HW2;

public class Task2 {
    public static void main(String[] args) {
        // Инициализируем массив intArray как новый массив int (целых чисел)
        int[] intArray = {1, 2, 3};

        try {
            int d = 0;
            // Используем try-catch для обработки исключения при делении на ноль
            double catchedRes1 = (double) intArray[2] / d; // Используем индекс 2 для примера (элемент: 3)
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            // Обработка исключения ArithmeticException, если произошло деление на ноль
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения ArrayIndexOutOfBoundsException, если индекс выходит за пределы массива intArray
            System.out.println("Catching exception: " + e);
        }
    }
}
