package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя стоимость товара
        System.out.print("Введите стоимость товара: ");
        double cost = scanner.nextDouble();

        // Запрашиваем у пользователя количество товара
        System.out.print("Введите количество товара: ");
        int quantity = scanner.nextInt();

        // Запрашиваем у пользователя налог
        System.out.print("Введите значение налога: ");
        double tax = scanner.nextDouble();

        // Закрываем Scanner, так как больше не нужен
        scanner.close();

        // Вычисляем общую стоимость с учетом налога в 20%
        double totalCost = calculate(cost, quantity, tax);

        // Выводим результат
        System.out.println("Общая стоимость с учетом налога: " + totalCost);
    }

    public static double calculate(double cost, int quantity, double tax) {
        //здесь нужно написать код
        return Double.NaN;
    }
}