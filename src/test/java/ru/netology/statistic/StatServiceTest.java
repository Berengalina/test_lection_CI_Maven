package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void findMax() {
        StatService service = new StatService();
        long[] incomesInBillion = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};
        long expected = 13;
        long actual = service.findMax(incomesInBillion);
        assertEquals(expected, actual);

    }
}