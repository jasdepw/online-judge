# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        result = []
        path = []
        
        self.recursivePath(root, path, result)
        return result
        
    
    def recursivePath(self, node, path, result):
        if node is None:
            return
        
        if node.left is None and node.right is None:
            ans = ""
            for i in path:
                ans += (str(i.val) + "->")
            result.append(ans + str(node.val))
            
        if node.left:
            path.append(node)
            self.recursivePath(node.left, path, result)
            path.pop()
            
        if node.right:
            path.append(node)
            self.recursivePath(node.right, path, result)
            path.pop()