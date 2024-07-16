
import java.util.Scanner;
public class BST {
    static class Node {
    int data;
    Node left;
    Node right;
      Node(int data){
        this.data=data;
      }  
    }
    //to insert root in to the binary search tree
    public static Node insert(Node root, int val){//return type is Node because we want recursive return type
if(root==null){
    root=new Node(val);
    return root;
}
if(root.data>val){
    // go to left subtree
   root.left= insert(root.left, val);
}
else{
    root.right=insert(root.right,val);
}
return root;
    }
    // traversal of binary search tree
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }


    public static void preorder(Node root){
        if(root==null){
            return;
        }
       
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
       
    }
    
    //if we want to search any particular node in the tree
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }else if(root.data==key){
            return true;
        }else{
            return search(root.right,key);
        }
    }
    // if we want to delete any particular node in the tree
    public static Node delete(Node root, int val){
        if(root==null){
            return null;
        }
        if(root.data>val){
            root.left=delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }else{
            //caase 1  no child node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2  one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
//case 3
Node IS=inordersuccesor(root.right);
root.data=IS.data;
root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inordersuccesor(Node root){
while(root.left!=null){
    root=root.left;
}
return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numer of nodes u want to add : ");
        int n=sc.nextInt();
        int[]values=new int[n];
        System.out.println("enter the value of nodes : ");
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.println(" sorted tree : ");
        inorder(root);
        // System.out.println();
        System.out.println("preorder traversal : ");
        preorder(root);
        System.out.println("postorder traversal : ");
        postorder(root);
        int val;
        
        System.out.println("enter the node to search: ");
        val=sc.nextInt();
        if(search(root,val)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        int delval;
        System.out.println("enter node to delete : ");
        delval=sc.nextInt();
        root=delete(root,delval);
        System.out.println("updated tree after deletion : ");
        inorder(root);
    }
}
