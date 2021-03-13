package hw_lesson_2;

public class ArrayExceptions1 {
    public static void main(String[] args) {

        String[][] arr = {
                {"0", "1", "2", "3"},
                {"3", "2", "1", "0"},
                {"0", "1", "2", "3"},
                {"3", "2", "1", "0"}
        };
        printArr(arr);
        int sum = sumArr(arr);
        System.out.println("Сумма элементов массива составялет: " + sum);
    }

    public static void printArr(String[][] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static int sumArr(String[][] arr) throws MyArraySizeException1, MyArrayDataException1 {
        int count = 0;

        for (int a = 0; a < arr.length; a++) {
            if (arr.length != 4 || arr[a].length != 4)
                throw new MyArraySizeException1("Размер массива должен быть 4х4. Ошибка в строке" + "[" + a + "]");

            for (int b = 0; b < arr[a].length; b++) {
                try {
                    count += Integer.parseInt(arr[a][b]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException1("Неверный формат данных в ячейке " + "[" + a + "][" + b + "]");
                }
            }
        }
        return count;
    }
}
