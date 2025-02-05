/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
function inorder(root,ans){
    if(root==null){
        return;
    }
    inorder(root.left,ans);
    ans.push(root.val);
    inorder(root.right,ans);
}
var inorderTraversal = function(root) {
    let ans=[];
    inorder(root,ans);
    return ans;
};