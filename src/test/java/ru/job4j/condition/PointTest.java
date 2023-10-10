package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00To20Then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To22Then1Dot41() {
        double expected = 1.41;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when59To81Then8Dot51() {
        double expected = 8.54;
        Point point1 = new Point(5, 9);
        Point point2 = new Point(8, 1);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when99To73Then6Dot32() {
        double expected = 6.32;
        Point point1 = new Point(9, 9);
        Point point2 = new Point(7, 3);
        double out = point1.distance(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}