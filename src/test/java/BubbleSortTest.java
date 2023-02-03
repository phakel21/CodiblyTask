import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortCheckInteger() {
        List<Comparable> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(8);
        input.add(3);
        input.add(8);

        BubbleSort bubbleSort = new BubbleSort();
        input = bubbleSort.sort(input);

        List<Comparable> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(8);
        result.add(8);

        assertEquals(result, input);
    }

    @Test
    void sortCheckWithNegativeInteger() {
        List<Comparable> input = new ArrayList<>();
        input.add(-9.3);
        input.add(0.2);
        input.add(4d);
        input.add(0.1);
        input.add(5d);
        input.add(9d);

        BubbleSort bubbleSort = new BubbleSort();
        input = bubbleSort.sort(input);

        List<Comparable> result = new ArrayList<>();
        result.add(-9.3);
        result.add(0.1);
        result.add(0.2);
        result.add(4d);
        result.add(5d);
        result.add(9d);

        assertEquals(result, input);
    }

    @Test
    void sortCheckIfEmpty() {
        List<Comparable> input = new ArrayList<>();

        BubbleSort bubbleSort = new BubbleSort();
        input = bubbleSort.sort(input);

        List<Comparable> result = new ArrayList<>();

        assertEquals(result, input);
    }

    @Test
    void sortCheckIfContainsNullAndListGreater1() {
        List<Comparable> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);

        BubbleSort bubbleSort = new BubbleSort();
        input = bubbleSort.sort(input);

        List<Comparable> result = new ArrayList<>();
        result.add(5.0001);
        assertEquals(result, input);
    }

    @Test
    void sortCheckIfContainsOnlyNull() {
        List<Comparable> input = new ArrayList<>();
        input.add(null);

        BubbleSort bubbleSort = new BubbleSort();

        List<Comparable> result = new ArrayList<>();
        result.add(5.0001);
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(input));
    }


}