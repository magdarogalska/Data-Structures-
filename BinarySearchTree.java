public class BinarySearchTree <E extends Comparable>{
    private int size;


    private TreeNode root;
    public BinarySearchTree(){
        this.size=0;

    }
    public void add(E item){
        this.root = add(this.root,item);
        size+=1;
    }

    private TreeNode add(TreeNode root, E item){

        if (root==null){
            TreeNode newNode = new TreeNode(item);
            return newNode;
        }
        else if(item.compareTo(root.item)==0){
            return root;
        }
        else if(item.compareTo(root.item)<0){
            root.left = add(root.left, item);
            return root;
        }
        else {
            root.right = add(root.right, item);
            return root;
        }


    }
    private void toString(TreeNode root){
        //inorder traversal
        //visit left tree, visit the root, then visit the right tree
        if (root==null){
            return;
        }
        toString(root.left);
        System.out.println(root.item);
        toString(root.right);


    }
    public String toString(){
        toString(this.root);
        return null;
    }
    //TODO
    private TreeNode delete(TreeNode root){
        //3 cases
        //if the node is not connected to anything
        //if node has some connections
        //if node is a root
        if (root.left==null &&root.right==null){
            root=null;
        }
        return root;
    }





}
