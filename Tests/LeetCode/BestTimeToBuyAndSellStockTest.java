package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void testCase1() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfitOptimized(new int[] {
                7,1,5,3,6,4
        }));
    }

    @Test
    public void testCase2() {
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfitOptimized(new int[] {
                7,6,4,3,1
        }));
    }
}