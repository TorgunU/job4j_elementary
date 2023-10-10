package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax1432Then4() {
        int first = 1;
        int second = 4;
        int third = 3;
        int fourth = 2;
        int expected = 4;
        int out = Max.max(first, second, third, fourth);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax623Then4() {
        int first = 6;
        int second = 2;
        int third = 3;
        int expected = 6;
        int out = Max.max(first, second, third);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int expected = 5;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax2To2ThenRandom() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }
}