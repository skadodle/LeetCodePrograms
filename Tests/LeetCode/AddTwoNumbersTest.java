package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddTwoNumbersTest {
    @Test
    public void testCase1() {
        AddTwoNumbers.ListNode firstNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{5, 6, 4});
        AddTwoNumbers.ListNode secondNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{2, 4, 3});
        int[] arrayOutput = AddTwoNumbers.ListNode.ListToArray(AddTwoNumbers.addTwoNumbers(firstNumber, secondNumber));
        assertArrayEquals(new int[]{7, 0, 8}, arrayOutput);
    }

    @Test
    public void testCase2() {
        AddTwoNumbers.ListNode firstNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{0});
        AddTwoNumbers.ListNode secondNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{0});
        int[] arrayOutput = AddTwoNumbers.ListNode.ListToArray(AddTwoNumbers.addTwoNumbers(firstNumber, secondNumber));
        assertArrayEquals(new int[]{0}, arrayOutput);
    }

    @Test
    public void testCase3() {
        AddTwoNumbers.ListNode firstNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{9, 9, 9, 9, 9, 9, 9});
        AddTwoNumbers.ListNode secondNumber = AddTwoNumbers.ListNode.ArrayToList(new int[]{9, 9, 9, 9});
        int[] arrayOutput = AddTwoNumbers.ListNode
                .ListToArray(AddTwoNumbers.addTwoNumbers(firstNumber, secondNumber));
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, arrayOutput);
    }
}