package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StreetDirectionFlowTest {

    @Test
    public void testEnumValues() {
        StreetDirectionFlow[] values = StreetDirectionFlow.values();
        assertThat(values).containsExactly(StreetDirectionFlow.ONE_WAY, StreetDirectionFlow.TWO_WAY);
    }

    @Test
    public void testValueOf() {
        assertThat(StreetDirectionFlow.valueOf("ONE_WAY")).isEqualTo(StreetDirectionFlow.ONE_WAY);
        assertThat(StreetDirectionFlow.valueOf("TWO_WAY")).isEqualTo(StreetDirectionFlow.TWO_WAY);
    }
}
