package ru.geekbrains.homework04;

/**
 * Исключение, когда размер массива не соответствует условиям
 */
public class MyArraySizeException extends Exception{

    public MyArraySizeException(String message) {
        super(message);
    }
}
