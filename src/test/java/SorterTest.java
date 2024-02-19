import ge.nika.sorting.Sorter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SorterTest {
    private static final Logger logger = Logger.getLogger(SorterTest.class.getName());

    Sorter sorting = new Sorter();

    private int[] array;

    public SorterTest(int[] array) {
        this.array = array;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 420, 2, 52, 12, 103, 125, 5, 5123, -202}},
                {new int[]{1, 230, -3, 34, 1, 2310, 345, 5, 2123, 323}},
                {new int[]{3, 2, -14, -4, 5, -10, 25, 415, 1233, 2}},
                {new int[]{0, 130, 200, 4, 3, 13, 100, 5032, -123, 3}}
        });
    }

    @Test
    public void testNullCase() {
        try {
            sorting.sort(null);
            fail();

        } catch (IllegalArgumentException e) {

            logger.info("testNullCase: Passed");
            assertTrue(true);

        } catch (Exception e) {
            throw new NullPointerException("Unexpected exception");
        }

    }

    /*
    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }
     */


    @Test
    public void testEmptyCase() {
        int[] emptyArray = {};
        sorting.sort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray);

        logger.info("test Empty Case: Passed");
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] singleArgArray = {7};
        sorting.sort(singleArgArray);
        assertArrayEquals(new int[]{7}, singleArgArray);

        logger.info("test Single Argument: Passed");

    }

    @Test
    public void testSortedArraysCase() {
        int[] arr = {-5, 1, 2, 3, 4, 5, 23, 39};
        int[] sortedArr = sorting.sort(arr);
        assertArrayEquals(new int[]{-5, 1, 2, 3, 4, 5, 23, 39}, sortedArr);

        logger.info("test Sorted Array Case: Passed");
    }

    @Test
    public void test10Arguments() {
        int[] sortedArray = sorting.sort(array);
        Arrays.sort(array);
        assertArrayEquals(array, sortedArray);

        logger.info("test 10 Arguments: Passed");
    }

    @Test
    public void testMoreThan10Arguments() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 10, 0, 6, 5, 3, 5, 19,};
        int[] sorterArr = sorting.sort(arr);
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9, 10, 19,}, sorterArr);

        logger.info("test More Than 10 arguments: Passed");
    }

}