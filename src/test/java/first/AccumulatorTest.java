package first;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccumulatorTest {


    @Test(expected = NumberOutOfBoundException.class)
    public void should_get_exception_when_input_1000() throws Exception {
        final Accumulator accumulator = new Accumulator();
        final int actrual = accumulator.accumulate(1001);

    }
}