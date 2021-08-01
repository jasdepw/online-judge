# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        
        resultNode = ListNode()
        n1 = ''
        n2 = ''
        
        while l1:
            n1 += str(l1.val)
            l1 = l1.next
            
        while l2:
            n2 += str(l2.val)
            l2 = l2.next
            
        result = str(int(n1[::-1]) + int(n2[::-1]))
        cur_node = resultNode
        
        for i in result[::-1]:
            cur_node.next = ListNode()
            cur_node = cur_node.next
            cur_node.val = int(i)  
            
        return resultNode.next