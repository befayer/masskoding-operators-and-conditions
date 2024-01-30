package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя возраст
        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        // Запрашиваем у пользователя наличие разрешения от родителей
        System.out.print("Есть ли разрешение от родителей? (true/false): ");
        boolean parentalPermission = scanner.nextBoolean();

        permissionCheck(age, parentalPermission);

        // Закрываем Scanner, так как больше не нужен
        scanner.close();
    }

    public static void permissionCheck(int age, boolean parentalPermission) {
        // Проверка допустимости входа в кинотеатр
        /// здесь код...
    }
}
