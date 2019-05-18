import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.ArrayFlattenerService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorNullTest {

    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
    ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);



    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void reverseArray() {
        int[][] input = null;
        when(arrayFlattenerService.flattenArray(input)).thenReturn(null);
        int[] actual = arrayReversor.reverseArray(input);
        int[] expected = null;
        assertArrayEquals(expected,actual);
        verify(arrayFlattenerService).flattenArray(input);


    }


}