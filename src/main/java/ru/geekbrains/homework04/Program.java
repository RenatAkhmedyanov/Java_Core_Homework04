package ru.geekbrains.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        System.out.println("Первый массив:");
        printArray(array1);
        try {
            System.out.println("Сумма элементов в массиве: " + checkArrayAndCountSum(array1));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();
        String[][] array2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        System.out.println("Второй массив:");
        printArray(array2);
        try {
            System.out.println("Сумма элементов в массиве: " + checkArrayAndCountSum(array2));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        String[][] array3 = {{"1", "2", "3", "4"}, {"5", "6", "7b", "8"}, {"szczx", "10", "11", "12"}, {"13", "14", "15", "16"}};
        System.out.println("Третий массив:");
        printArray(array3);
        try {
            System.out.println("Сумма элементов в массиве: " + checkArrayAndCountSum(array3));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int checkArrayAndCountSum (String[][] array) throws MyArraySizeException {
        int sum = 0;
        if (array.length == 4 && array[0].length == 4) {
            System.out.println("Корректные размеры массива.");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[0].length; j++){
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        System.out.printf("Ошибка в ячейке [%d, %d]\n", i, j);
                        throw new MyArrayDataException("Неверный формат значения в ячейке");
                    }
                }
            }
        } else {
            throw new MyArraySizeException("Неверный размер массива! Массив должен быть 4х4!");
        }
        return sum;
    }

    private static void printArray(String[][] array) {
        System.out.println("=". repeat(21));
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.printf("%-6s", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("=". repeat(21));
    }
}
