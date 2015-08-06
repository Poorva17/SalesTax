package salestax;

import com.salestax.Input;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

import static org.junit.Assert.assertEquals;


public class InputTest {

    @Before
    public void setUpStreams() {
        System.setIn(new ByteArrayInputStream("1 book at 12.49".getBytes()));
    }

    @Test
    public void shouldReturnInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Input input = new Input(bufferedReader);

        assertEquals("1 book at 12.49", input.acceptInput());
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }
}
