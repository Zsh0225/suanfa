package 数据结构法.二叉树.二叉树遍历;

public class 遍历二叉树 {
    public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    Node root = new Node(1,"松江");
    Node node2 = new Node(2,"无用");
    Node node3 = new Node(3,"路径一");
    Node node4 = new Node(4,"林冲");
    Node node5 = new Node(5,"高俅");
    root.setLeft(node2);
    root.setRight(node4);
    node4.setLeft(node3);
    node4.setRight(node5);
    binaryTree.setRoot(root);
    //测试
//    System.out.println("前序");
//    binaryTree.preOrder();
    System.out.println("中序");
    binaryTree.infixOrder();
    System.out.println("后序");
    binaryTree.postOrder();

    }
}
class BinaryTree{
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }
    //前序遍历
    public void preOrder(){
        if (this.root!=null){
            this.root.preOrder();
        }
        else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void infixOrder(){
        if (this.root!=null){
            this.root.infixOrder();
        }
        else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void postOrder(){
        if (this.root!=null){
            this.root.postOrder();
        }
        else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
}

class Node{
    private  int no;
    private String name;
    private Node left;
    private Node right;

    public Node(int no, String name, Node left, Node right) {
        this.no = no;
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    //前序遍历
    public void preOrder(){
        System.out.println(this);//先输出父节点
        //递归向左子树前序遍历
        if(this.left!=null){
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if (this.right!=null){
            this.right.preOrder();
        }
    }
    //中序遍历
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    public void postOrder(){
        if(this.left!=null){
            this.left.postOrder();
        }
        //递归向右子树前序遍历
        if (this.right!=null) {
            {
                this.right.postOrder();
            }
        }
        System.out.println(this);
    }
    //前序遍历查找
/*    public Node preOrdersearch(int no){
        //比较当前结点是不是
        if(this.no ==no) {
            return this;
        }
        //1.判断当前节点的左子节点是否为空，如果不为空，则递归前序查找
        //2.如果左递归前序查找，找到节点则返回
        Node resNode = null;
        if (this.left != null) {
            preOrdersearch(no);
        }
        if (resNode!=null){//说明左子树找到了
            return resNode;
        }
        
    }*/
}