package 数据结构法.链表;

public class T234_回文链表 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }//Leetcode中链表的定义
    }

    private static ListNode createLinkedList(int[] arr) {//将输入的数组输入到链表中
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {//过程
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {//将链表结果打印
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }
//函数主体
    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode head2 = head;
        ListNode temp = head.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        printLinkedList(prev);
        printLinkedList(head);
        while (prev != null && head != null) {
            if (head.val == prev.val) {
                if (head.next != null && prev.next != null) {
                    head = head.next;
                    prev = prev.next;
                } else return true;
            } else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] x = {1, 1, 2, 1};
        ListNode list = createLinkedList(x);
//        printLinkedList(list);
        Boolean ans=isPalindrome(list);


    }
}
