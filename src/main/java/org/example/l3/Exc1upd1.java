package org.example.l3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

/**Введите общее кол-во секунд, и получите часы, минуты и оставшиеся секунды (DateTime) **/

public class Exc1upd1 {
    public static void main(String[] args) {

        int sec = 626262;
        Duration duration = Duration.ofSeconds(626262);
        DurationFormat formatter = new DurationFormat("");
        System.out.println(formatter.format(duration));




    }
}
