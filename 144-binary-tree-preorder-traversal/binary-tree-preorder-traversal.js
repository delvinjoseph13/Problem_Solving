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
var preorderTraversal = function(root) {
    let result=[];

    function traverse(root){
        if(root===null){
        return;
        }

        result.push(root.val);
        traverse(root.left)
        traverse(root.right);
    }
    traverse(root);
    return result;
};