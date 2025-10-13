package Tree;
import java.util.*;
// basic not optimal not realtime
public  class BinaryTree {
	Node root;

	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	public BinaryTree(int data) {
		root = new Node(data);
	}
	public void insertleft(Node r,int val) {
		Node newNode = new Node(val);
		r.left = newNode;
	}
	public void insertright(Node r,int val) {
		Node newNode = new Node(val);
		r.right=newNode;
	}
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		}
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	Queue<Node> qu = new LinkedList<>();
	public void levelOrder(Node root) {
		qu.add(root);
		while(!qu.isEmpty()) {
			Node n = qu.poll();
			System.out.print(n.data+" ");
			
			if(n.left != null) {
				qu.add(n.left);
			}
			if(n.right != null) {
				qu.add(n.right);
			}
		}
	}
	
}


