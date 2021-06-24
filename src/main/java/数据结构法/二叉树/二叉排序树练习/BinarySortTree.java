package 数据结构法.二叉树.二叉排序树练习;

public class BinarySortTree {
    public static void main(String[] args) {
        BinarySortTree tree = new BinarySortTree();
        tree.put(7);
        tree.put(4);
        tree.put(13);
        tree.put(2);
        tree.put(5);
        tree.put(8);
        tree.put(14);
        tree.delete(13);
//        System.out.println("值为8的节点信息"+node+"---"+node.value);
    }

    Node parent;
    /*创建节点的两个方法*/
    private Node createNode(int value){
        return new Node(null,value,null);
    }
    private Node createNode(Node left,int value ,Node right) {
        return new Node (left,value,right);
    }
    /**删除节点 */
    public void delete(int value){
        //记录要删除的节点
        Node p = parent;
        //记录要删除的节点的父节点
        Node p_parent = null;
        //先找到要删除的元素
        while (p!=null){
            if (p.value>value){
                p_parent=p;
                p=p.left;
            }
            else if(p.value<value){
                p_parent=p;
                p=p.right;
            }
            else {
               break;
            }
        }
        if (p==null) {
            return ;
        }
        //要删除的节点有两个子节点
        if (p.left!=null&&p.right!=null){
            Node rt = p.right;
            Node rt_parent = p;
            while(rt.left!=null){
                rt_parent = rt;
                rt=rt_parent.left;
            }
            //用右子树中的最小节点取替换要删除的节点的位置
            p.value=rt.value;
            p=rt;
            p_parent=rt_parent;
        }
        //当要删除的节点是叶子节点或只有一个子节点的节点
        Node child = null;
        if (p.right!=null){
            child=p.right;
        }else if(p.left!=null){
            child=p.left;
        }
        else {
            child=null;
        }
        //执行删除操作
        if(p_parent==null){
            parent=child;
        }else if (p_parent.left==p){
            p_parent.left=child;
        }else {
            p_parent.right=child;
        }







    }

    /**查找结点*/
    public Node find(int value){
        while (parent!=null){
            if (parent.value>value){
                parent=parent.left;
            }
            else if(parent.value<value){
                parent=parent.right;
            }
            else {
                return parent;
            }
        }
    return parent;
    }

    /**插入节点*/
    public boolean put(int value){
        if(parent==null){
            parent=createNode(value);
            return true;
        }
        Node pt =parent;
        while (pt!=null){
            if(pt.value>value){
                if (pt.left==null){
                    pt.left= createNode(value);
                    return true;
                }
                pt = pt.left;
                }
            else if(value>pt.value){
                if (pt.right==null){
                    pt.right = createNode(value);
                    return true;
                }
                pt=pt.right;
            }
        }
        return false;
    }
    private static class Node{
        private Node left;
        private int value;
        private Node right;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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

        private Node(Node left, int value, Node right){
            this.left=left;
            this.right=right;
            this.value=value;
        }


    }

}
