package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя номер месяца
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        // Закрываем Scanner, так как больше не нужен
        scanner.close();

        // Определение сезона
        String season = checkSeasons(month);

        // Выводим результат
        System.out.println("Сезон: " + season);
    }

    public static String checkSeasons(int month) {
        return null;
    }
}
