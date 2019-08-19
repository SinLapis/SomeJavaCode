package org.sinlapis.offer.agt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void solution() {
        assertEquals(2, Q3.solution(new int[]{2, 3, 1, 0, 2, 5, 3}));
        assertEquals(-1, Q3.solution(new int[0]));
        assertEquals(-1, Q3.solution(null));
        assertEquals(-1, Q3.solution(new int[]{0, 1, 2, 3}));
        assertEquals(-1, Q3.solution(new int[]{1, 2, 3}));
    }
}