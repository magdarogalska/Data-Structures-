public class TreeNode<E extends Comparable> {
    protected TreeNode left;
    protected TreeNode right;
    protected E item;


    public TreeNode(E item){
        this.item=item;
    }

}
