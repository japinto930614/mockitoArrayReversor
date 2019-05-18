
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.ArrayFlattenerService;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {

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
        int[][] input = new int[][] { {1,3}, {0}, {4,5,9}};
        when(arrayFlattenerService.flattenArray(input)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = arrayReversor.reverseArray(input);
        int[] expected = new int[]{9,5,4,0,3,1};
        assertArrayEquals(expected,actual);
        verify(arrayFlattenerService).flattenArray(input);

//        int[][] input ={ {1,3}, {0}, {4,5,9}};
//        assertArrayEquals(new int[]{9, 5, 4, 0, 3, 1}, arrayReversor.reverseArray(input));
//        assertEquals(null, arrayReversor.reverseArray(null));
    }



}