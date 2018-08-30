import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorSpecification {

    @Test
    public void shouldReturn2onAdding1and1() {
        //GIVEN
        CalculatorService cs = mock(CalculatorService.class);
        Calculator c = new Calculator(cs);

        //WHEN-THEN
        when(cs.add(1,1)).thenReturn(2);
        assertEquals(2, c.performAdd(1,1));
        verify(cs).add(1,1);
    }

}
