
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlattenAndSortArrays {




    public static void main(String[] args) {
        int[][] multiples = new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}};
        FlattenAndSortArrays obj= new FlattenAndSortArrays();
        obj.flattenAndSort(multiples);

    }

    public static int[] flattenAndSort(int[][] array) {
        return Stream.of(array).flatMapToInt(IntStream::of).sorted().toArray();
    }


    }
