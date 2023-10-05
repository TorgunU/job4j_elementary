package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5901100Then0159100() {
        int[] data = new int[] {100, 5, 9, 0, 1};
        int[] expected = new int[] {0, 1, 5, 9, 100};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when840Then048() {
        int[] data = new int[] {8, 4, 0};
        int[] expected = new int[] {0, 4, 8};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}