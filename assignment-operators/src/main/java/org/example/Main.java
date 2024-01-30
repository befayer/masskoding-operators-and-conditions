package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя температуру в градусах Цельсия
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusTemperature = scanner.nextDouble();

        // Закрываем Scanner, так как больше не нужен
        scanner.close();

        // Вычисляем температуру в градусах Фаренгейта
        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);

        // Выводим результат
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheitTemperature);
    }

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return Double.NaN;
    }
}
