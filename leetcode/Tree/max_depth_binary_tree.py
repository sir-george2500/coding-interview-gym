
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def dfs(root):

            if not root:
                return 0

            leftDepth = dfs(root.left)
            rightDepth = dfs(root.right)

            return max(leftDepth,rightDepth) + 1 

        return dfs(root)
