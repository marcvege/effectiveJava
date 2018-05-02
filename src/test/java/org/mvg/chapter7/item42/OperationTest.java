package org.mvg.chapter7.item42;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mvg.chapter7.item42.Operation.*;

public class OperationTest {

    @Test
    public void apply() {
        assertThat(5.0, is(DIVIDE.apply(25, 5)));
        assertThat(5.0, is(PLUS.apply(2, 3)));
        assertThat(5.0, is(TIMES.apply(1, 5)));
        assertThat(5.0, is(MINUS.apply(10, 5)));
    }
}