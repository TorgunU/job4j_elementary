package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    public void whenStart3Finish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenStart1Finish5Then15() {
        int start = 1;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}