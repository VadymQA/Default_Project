package com.IT.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.stream.Collectors;

public class QAUtils {
    public static String getRandomString(int count){
        return new Random().ints('a','z' )
                .limit(count)
                .mapToObj(s->""+(char)s)
                .collect(Collectors.joining());
    }

    public String getCurrentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }
}
