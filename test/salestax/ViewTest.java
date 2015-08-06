package salestax;

import com.salestax.View;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;


public class ViewTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        original = System.out;
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

    @Test
    public void shouldPrintMessage() {
        View view = new View();
        String message = "Enter Items Purchased: (Enter Quit to get the bill)\n";
        view.printMessage(message);

        Assert.assertEquals("Enter Items Purchased: (Enter Quit to get the bill)\n", outputStream.toString());
    }


}

