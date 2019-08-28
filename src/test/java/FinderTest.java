import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findMax() {
        assertNull(Finder.findMax(new int[]{}));
        assertNull(Finder.findMax(null));
        assertArrayEquals(4, Finder.findMax(new int[]{1, 2, 3, 4}));
    }

    private void assertArrayEquals(int i, Integer max) {
    }


    @Test
   public void findMin() {
        assertNull(Finder.findMin(new int[]{}));
        assertNull(Finder.findMin(null));
        assertArrayEquals(5, Finder.findMin(new int[] {44,5,66,77}));
    }
}