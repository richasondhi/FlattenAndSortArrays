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


}