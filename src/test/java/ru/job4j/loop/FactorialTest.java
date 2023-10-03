package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialFor5Then120() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int expected = 1;
        int in = 0;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }
}