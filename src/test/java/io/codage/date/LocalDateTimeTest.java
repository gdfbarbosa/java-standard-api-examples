package io.codage.date;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalDateTimeTest {
    @Test
    public void shouldConvertToUnixTimestamp() {
        long timeStamp = ZonedDateTime.parse("2022-11-14T17:14:09.709Z").toEpochSecond();
        assertEquals(1668446049, timeStamp);
    }
}
