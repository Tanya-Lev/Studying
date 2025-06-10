package org.example.oshibki;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

/**
 * Утилитный класс для вычисления хэша SHA-256.
 */
public class Hash256Util {

    /**
     * Хэширует входную строку с помощью алгоритма SHA-256
     * @param input строка, которую нужно захэшировать
     * @return шестнадцатеричное представление хэша
     */
    public static String hash(String input) {
        try {
            // Получаем экземпляр MessageDigest для SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Преобразуем строку в массив байтов с кодировкой UTF-8
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Преобразуем массив байтов в шестнадцатеричную строку
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                // Форматируем каждый байт как двухсимвольное шестнадцатеричное число
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            // Если алгоритм не найден, выбрасываем исключение
            throw new RuntimeException("Ошибка: алгоритм SHA-256 не найден", e);
        }
    }
}

