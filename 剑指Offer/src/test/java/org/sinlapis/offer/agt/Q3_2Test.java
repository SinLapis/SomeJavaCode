package org.sinlapis.offer.agt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3_2Test {

    @Test
    void solution() {
        int[] arr = {2, 3, 5, 4, 3, 2, 6, 7};
        int result = Q3_2.solution(arr);
        assertTrue(result == 2 || result == 3);
        assertArrayEquals(new int[]{2, 3, 5, 4, 3, 2, 6, 7}, arr);
    }
}