package scratch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class SorterTest {

    @Test
    public void bubbleSort() {
        assertEquals(List.of(1), Arrays.stream(Sorter.bubbleSort(new int[]{1})).boxed().collect(Collectors.toList()));
        assertEquals(List.of(1,2), Arrays.stream(Sorter.bubbleSort(new int[]{2,1})).boxed().collect(Collectors.toList()));
    }
}