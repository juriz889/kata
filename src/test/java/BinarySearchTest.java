import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @ParameterizedTest
    @MethodSource("allTestCases")
    public void testAll(int[] sortedInt, int searchFor, int expect) {
        BinarySearch cut = new BinarySearch();
        int result = cut.search(sortedInt, searchFor);
        assertThat(result).isEqualTo(expect);
    }

    private static Stream<Arguments> allTestCases() {
        return Stream.of(Arguments.of(new int[]{1}, 1, 0),
                Arguments.of(new int[]{1}, 2, -1),
                Arguments.of(new int[]{1, 3, 5}, 1, 0),
                Arguments.of(new int[]{1, 3, 5, 7}, 1, 0),
                Arguments.of(new int[]{1, 3, 5, 7}, 3, 1),
                Arguments.of(new int[]{1, 3, 5, 7}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 7}, 7, 3),
                Arguments.of(new int[]{1, 3, 5, 7}, 0, -1),
                Arguments.of(new int[]{1, 3, 5, 7}, 2, -1),
                Arguments.of(new int[]{1, 3, 5, 7}, 4, -1),
                Arguments.of(new int[]{1, 3, 5, 7}, 6, -1),
                Arguments.of(new int[]{1, 3, 5, 7}, 8, -1),
                Arguments.of(new int[]{}, 3, -1),
                Arguments.of(new int[]{1}, 3, -1),
                Arguments.of(new int[]{1}, 1, 0),
                Arguments.of(new int[]{1, 3, 5}, 1, 0),
                Arguments.of(new int[]{1, 3, 5}, 3, 1),
                Arguments.of(new int[]{1, 3, 5}, 5, 2),
                Arguments.of(new int[]{1, 3, 5}, 0, -1),
                Arguments.of(new int[]{1, 3, 5}, 2, -1),
                Arguments.of(new int[]{1, 3, 5}, 4, -1),
                Arguments.of(new int[]{1, 3, 5}, 6, -1));
    }

}