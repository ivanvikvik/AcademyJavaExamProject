package by.itstep.finalexam.model.logic;

import static by.itstep.finalexam.model.logic.Task01.findBestMarkNumber;
import static org.junit.Assert.*;

import org.junit.Test;

public class Task01Test {

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithNull() {
        // Arrange
        int expected = -1;

        // Act
        int actual = findBestMarkNumber(null);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithEmptyObject() {
        // Arrange
        int[] marks = {};
        int expected = -1;

        // Act
        int actual = findBestMarkNumber(marks);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithOneDay() {
        int[] marks = {5};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithSixDays() {
        int[] marks = {5, 5, 5, 5, 5, 5};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithWrongMarksWhichAreLessThanMinMark() {
        int wrongMark = Task01.MIN_MARK - 1;
        int[] marks = {5, 5, 5, wrongMark, 5, 5, 5};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_NegativeCaseWithWrongMarksWhichAreMoreThanMaxMark() {
        int wrongMark = Task01.MAX_MARK + 1;
        int[] marks = {5, 5, 5, wrongMark, 5, 5, 5};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllBestMarks() {
        int bestMark = Task01.MAX_MARK;
        int[] marks = {bestMark, bestMark, bestMark, bestMark, bestMark, bestMark, bestMark};
        int expected = 7;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllNegativeMarks() {
        int[] marks = {2, 3, 2, 3, 2, 3, 2};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksButNotBestMarks() {
        int[] marks = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        int expected = 0;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndOneBestMarks() {
        int[] marks = {5, 4, 4, 4, 4, 4, 4};
        int expected = 1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndTwoBestMarks() {
        int[] marks = {5, 5, 4, 4, 4, 4, 4};
        int expected = 2;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndThreeBestMarks() {
        int[] marks = {5, 5, 5, 4, 4, 4, 4};
        int expected = 3;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndFourBestMarks() {
        int[] marks = {5, 5, 5, 5, 4, 4, 4};
        int expected = 4;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndFiveBestMarks() {
        int[] marks = {5, 5, 5, 5, 5, 4, 4};
        int expected = 5;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithAllGoodMarksAndSixBestMarks() {
        int[] marks = {5, 5, 5, 5, 5, 5, 4};
        int expected = 6;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithFirstSevenDays() {
        int[] marks = {5, 5, 4, 5, 4, 5, 4, 5, 4};
        int expected = 4;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithMiddleSevenDays() {
        int[] marks = {3, 4, 4, 4, 4, 5, 4, 5, 4, 3, 2};
        int expected = 2;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithLastSevenDays() {
        int[] marks = {3, 4, 4, 5, 5, 4, 4, 3, 4, 5, 4, 5, 4, 4, 4};
        int expected = 2;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithFirstMaxMarkNumber() {
        int[] marks = {5, 3, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 5, 5, 4, 4, 4, 3, 4};
        int expected = 7;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithMiddleMaxMarkNumber() {
        int[] marks = {5, 4, 5, 4, 5, 4, 4, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 5, 5, 5, 5, 5};
        int expected = 7;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithLasMaxMarkNumber() {
        int[] marks = {5, 3, 4, 5, 5, 5, 4, 5, 4, 4, 4, 4, 5, 5, 4, 4, 5, 5, 5, 5, 5, 5, 5};
        int expected = 7;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindBestMarkNumber_PositiveCaseWithNoRightPeriod() {
        int[] marks = {5, 5, 5, 5, 5, 5, 3, 4, 5, 5, 5, 5, 5};
        int expected = -1;
        int actual = findBestMarkNumber(marks);
        assertEquals(expected, actual);
    }
}