package first;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccumulatorTest {


    private Accumulator accumulator;

    @Before
    public void setUp() throws Exception {
        accumulator = new Accumulator();
    }

    @Test(expected = NumberOutOfBoundException.class)
    public void should_get_exception_when_input_1000() throws Exception {

        final int actrual = accumulator.accumulate(1001);

    }
}