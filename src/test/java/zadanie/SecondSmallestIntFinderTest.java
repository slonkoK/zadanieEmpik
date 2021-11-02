package zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecondSmallestIntFinderTest {
    SecondSmallestIntFinder secondSmallestIntFinder;

    @BeforeEach
    void setUp() {
        secondSmallestIntFinder = new SecondSmallestIntFinder();
    }

    @Test
    void returnSecondSmallestFinder() {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(5,7,10));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(7,finder1);
    }
    @Test
    void returnNoSecondSmallestFinder() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,1,2,2,3,3));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(2,finder1);
    }

    @Test
    void shouldReturnZeroWhenListIsNull() {
        List<Integer> integerList = null;
        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(0,finder1);
    }
    @Test
    void returnNoSecondSmallest() {
        List<Integer> integerList = new ArrayList<>(Collections.emptyList());

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(0,finder1);
    }
    @Test
    void returnListWithOneElement() {
        List<Integer> integerList = new ArrayList<>(Collections.singletonList(1));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(1,finder1);
    }
    @Test
    void returnListWithOneElementChoosedFromListWithTwoElements() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(2,finder1);
    }
    @Test
    void shouldReturnPositiveFinder () {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(-1,2));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(2,finder1);
    }
    @Test
    void shouldReturnSecondMinNegativeFinder () {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(-1,-2));

        int finder1 = secondSmallestIntFinder.finder(integerList);

        assertEquals(-1,finder1);
    }
}