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
    public ListNode deleteDuplicates(ListNode head) {
        
        if( head == null || head.next == null ){
            return head;
        }
     
        ListNode answer = head;
        ListNode prevNode = null;
        
        int curr = 0;
        int prev = head.val;
        
        while( head != null ){
            
            curr = head.val;
            
            if( prevNode != null ){
                
                prev = prevNode.val;
                
                if( curr == prev ){
                
                    prevNode.next = head.next;
                
                }else{
                    
                    prevNode = head;
                    
                }
                
            }else{
                
                prevNode = head;
                
            }
            
            head = head.next;
        }
        
        return answer;            
        
    }   
    
}