/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        return null

    }

    private int getInt(ListNode node){
        ListNode nexListNode = node;
        
        //preparing the interger string
        String value = "";

        do{
            //casting the int to a string and concating it 
            value = value.concat(Integer.toString(nexListNode.val));

            //geting the next node if exist
            nexListNode = nexListNode.next;

            //checking to see if null, when null exit this loop
        }while(nexListNode != null);

        //convert the string to a Interger and reverse the integer
      return Integer.reverse(Integer.parseInt(value));
    }

    private ListNode createListNode(int number){
        String str = String.valueOf(number);

        ListNode newNode = ListNode(str.)
        do(

        )

    }



}
 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
// @lc code=end

