package salestax;

import com.salestax.Input;
import com.salestax.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class ParserTest {
    @Test
    public void shouldReturnDomainObject() {

        Input input = Mockito.mock(Input.class);
        Mockito.when(input.acceptInput()).thenReturn("1 book at 12.49");
        Parser parser = new Parser();
        parser.parseInput(input.acceptInput());
    }
}
