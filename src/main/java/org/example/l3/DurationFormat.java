package org.example.l3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class DurationFormat extends SimpleDateFormat {

    // Конструктор
    public DurationFormat(String pattern) {
        super(pattern);
    }

    // Метод для форматирования Duration
    public String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();

        long days = TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours) - TimeUnit.DAYS.toMinutes(days);
        long remainingSeconds = seconds - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(seconds));

        // Форматируем продолжительность в нужном виде
        return String.format("%02d %02d:%02d:%02d", days, hours, minutes, remainingSeconds);
    }

    // Переопределение метода format для использования продолжительность
    public String format(Duration duration) {
        return formatDuration(duration);
    }



}
