package LeetCode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isFirstListEmpty;
        boolean isSecondListEmpty;

        boolean addToNextDigit = false;
        int sum;

        ListNode result = new ListNode(0);
        ListNode l3 = result;

        ListNode currentL1 = l1;
        ListNode currentL2 = l2;

        while (currentL1 != currentL2 || addToNextDigit) {
            ListNode currentResult = new ListNode();
            l3.next = currentResult;
            sum = 0;

            isFirstListEmpty = currentL1 == null;
            isSecondListEmpty = currentL2 == null;

            if (!isFirstListEmpty) {
                sum += currentL1.val;
                currentL1 = currentL1.next;
            }
            if (!isSecondListEmpty) {
                sum += currentL2.val;
                currentL2 = currentL2.next;
            }

            currentResult.val = sum % 10 + (addToNextDigit ? 1 : 0);
            addToNextDigit = sum > 9;

            if (currentResult.val > 9) {
                addToNextDigit = true;
                currentResult.val %= 10;
            }

            currentResult = currentResult.next;
            l3 = l3.next;
        }

        return result.next;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        // ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public static int[] ListToArray(ListNode list) {
            int size = 0;
            int[] array;
            ListNode current = list;

            while (current != null) {
                size++;
                current = current.next;
            }

            array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = list.val;
                list = list.next;
            }

            return array;
        }

        public static ListNode ArrayToList(int[] array) {
            ListNode list = new ListNode();
            ListNode current = list;

            for (int digit : array) {
                current.next = new ListNode(digit);
                current = current.next;
            }
            return list.next;
        }
    }
}
