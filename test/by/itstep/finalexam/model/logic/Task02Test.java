package by.itstep.finalexam.model.logic;

import org.junit.Test;

import static by.itstep.finalexam.model.logic.Task02.rotateMatrix;
import static org.junit.Assert.*;

public class Task02Test {

    @Test
    public void testRotateMatrix_NegativeCaseWithNull() {
        long[][] expected = {};
        long[][] actual = rotateMatrix(null, 'R');
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_NegativeCaseWithEmptyMatrix() {
        long[][] matrix = {};
        long[][] expected = {};
        long[][] actual = rotateMatrix(matrix, 'R');
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_NegativeCaseWithEmptyMatrixRows() {
        long[][] matrix = {{}, {}, {}};
        long[][] expected = {};
        long[][] actual = rotateMatrix(matrix, 'R');
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_NegativeCaseWithUpperWrongDirection() {
        long[][] matrix = {{69}};
        long[][] expected = {};

        for (char direction = 'A'; direction <= 'Z'; direction++) {
            if (direction != 'R' && direction != 'L') {
                long[][] actual = rotateMatrix(matrix, direction);
                assertArrayEquals(expected, actual);
            }
        }
    }

    @Test
    public void testRotateMatrix_NegativeCaseWithLowerWrongDirection() {
        long[][] matrix = {{69}};
        long[][] expected = {};

        for (char direction = 'a'; direction <= 'z'; direction++) {
            if (direction != 'r' && direction != 'l') {
                long[][] actual = rotateMatrix(matrix, direction);
                assertArrayEquals(expected, actual);
            }
        }
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateRightSquareMatrix() {
        char direction = 'R';

        long[][] matrix = {
                {1, 2},
                {3, 4}
        };

        long[][] expected = {
                {3, 1},
                {4, 2}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateRightRowRectMatrix() {
        char direction = 'R';

        long[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        long[][] expected = {
                {4, 1},
                {5, 2},
                {6, 3}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateRightColumnRectMatrix() {
        char direction = 'R';

        long[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        long[][] expected = {
                {5, 3, 1},
                {6, 4, 2}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateLeftSquareMatrix() {
        char direction = 'L';

        long[][] matrix = {
                {1, 2},
                {3, 4}
        };

        long[][] expected = {
                {2, 4},
                {1, 3}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateLeftRowRectMatrix() {
        char direction = 'L';

        long[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        long[][] expected = {
                {3, 6},
                {2, 5},
                {1, 4}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateLeftColumnRectMatrix() {
        char direction = 'L';

        long[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        long[][] expected = {
                {2, 4, 6},
                {1, 3, 5}
        };

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    @Test
    public void testRotateMatrix_PositiveCase_RotateLeftOneElementMatrix() {
        char direction = 'L';
        long[][] matrix = {{69}};
        long[][] expected = {{69}};

        long[][] actual = rotateMatrix(matrix, direction);

        assertMatrixEquals(expected, actual);
    }

    private void assertMatrixEquals(long[][] expected, long[][] actual) {
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}