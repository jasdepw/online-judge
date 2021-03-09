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
        ListNode answer = new ListNode();
        ListNode answer_copy = answer;
        
        int sum = 0;
        int addnext = 0;
        
        while( l1 != null || l2 != null ){
            sum = addnext;
            addnext = 0;
            
            if( l1 != null ){
                sum += l1.val;
                l1 = l1.next;
            }            
            if( l2 != null ){
                sum += l2.val;
                l2 = l2.next;
            }
            
            if( sum >= 10 ){ 
                sum %= 10;
                addnext = 1;
            }            
            
            ListNode temp = new ListNode(sum);
            
            answer_copy.next = temp;
            answer_copy = answer_copy.next;
        } 
        
        if( addnext == 1){
            ListNode temp = new ListNode(addnext);
            answer_copy.next = temp;
        }
        
        return answer.next;             
    }
}