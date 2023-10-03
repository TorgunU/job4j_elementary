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
}