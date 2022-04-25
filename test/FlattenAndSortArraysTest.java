import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FlattenAndSortArraysTest {
    public FlattenAndSortArrays obj;

    @Before
    public void setUp() {
        this.obj = new FlattenAndSortArrays();
    }

    @Rule
    public ExpectedException exception =ExpectedException.none();


   @Test
    @Description("Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, S2, 3, 4, 5, 6, 7, 8, 9].")
   public void exampleTest() {
       assertArrayEquals(new int[]{},
               obj.flattenAndSort(new int[][]{}));
       assertArrayEquals(new int[]{1},
               obj.flattenAndSort(new int[][]{{}, {1}}));
       assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
               obj.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
       assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100},
               obj.flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}}));
       assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999},
               obj.flattenAndSort(new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
   }
    @Test
    public void basicTest() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                obj.flattenAndSort(new int[][]{{9, 7, 5, 3, 1}, {8, 6, 4, 2, 0}, {}, {1}}));
        assertArrayEquals(new int[]{-2, -1, -1, 0, 1, 1, 1, 2, 3},
                obj.flattenAndSort(new int[][]{{1}, {}, {1}, {}, {}, {-1, -2, -1}, {0, 3}, {1}, {2}}));
        assertArrayEquals(new int[]{64, 100, 202, 303, 503, 504, 2500, 4096},
                obj.flattenAndSort(new int[][]{{}, {}, {64}, {}, {504, 503}, {4096}, {}, {303}, {202}, {2500}, {}, {100}}));
        assertArrayEquals(new int[]{0, 18, 27, 35, 46, 54, 63, 72, 81, 90},
                obj.flattenAndSort(new int[][]{{90, 81, 72}, {63, 54, 35}, {}, {46}, {27, 18, 0}}));
        assertArrayEquals(new int[]{-1, -1, -1, 0, 0, 0, 1, 1, 1},
                obj.flattenAndSort(new int[][]{{1}, {}, {1}, {1}, {0}, {-1}, {}, {0}, {-1}, {0}, {-1}}));
        assertArrayEquals(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1},
                obj.flattenAndSort(new int[][]{{-9, -8, -7, -6, -5, -4, -3, -2, -1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                obj.flattenAndSort(new int[][]{{9, 8, 7, 6, 5, 4, 3, 2, 1}}));
    }

}