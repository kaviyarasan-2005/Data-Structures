package Tree;
import java.util.*;
public class AVLtree {
	Node root;
	class Node {
		int data;
		Node left;
		Node right;
		int height;
		Node(int data){
			this.data = data;
			left = null;
			right=null;
			height =0;
		}
	}
	AVLtree(int data){
		root = new Node(data);
	}
	public void insert(int data) {
		root = insert(root,data);
	}
	public int getheight(Node root) {
		if(root == null) {
			return -1;
		}
		return root.height;
	}
	private Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left = insert(root.left,data);
		}
		else if(data> root.data) {
			root.right = insert(root.right,data);
		}
		else {
		return root;
		}
		root.height = 1+Math.max(getheight(root.left),getheight(root.right));
		int BalanceHeight = balance(root);
//		Left cases
		if(BalanceHeight > 1) {
			// LL case
			if(data < root.left.data) {
				return RightRotate(root);
			}
			// LR cases
			else if(data > root.left.data) {
				root.left = LeftRotate(root.left);
				return RightRotate(root);
			}
		}
		// RightCases
		else if(BalanceHeight < -1) {
			// RR case
			if(data > root.right.data) {
				return LeftRotate(root);
			}
			//RL case
			else if(data<root.right.data) {
				root.right = RightRotate(root.right);
				return LeftRotate(root);
			}
		}
		return root;
	}
	public void delete(int data) {
		delete(root,data);
	}
	private Node delete(Node root,int data) {
	
		if(root == null) {
			System.out.println("Element Not Found");
			return root;
		}
		if(root.data < data) {
			root.right=delete(root.right,data);
		}
		else if(root.data > data) {
			root.left=delete(root.left,data);
		}
		if(root.data == data) {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			root.data = min(root.right);
			root.right=delete(root.right,root.data);
		}
		root.height =1+Math.max(getheight(root.left),getheight(root.right));
		int balance = balance(root);
		// Left Condition
		if(balance > 1) {
			// LL case
			if(root.left.data < data ) {
				return RightRotate(root);
			}
			// LR rotate
			if(root.left.data > data) {
				root.left = LeftRotate(root.left);
				return RightRotate(root);
			}
		}
		// Right case
		if(balance < -1) {
			//RR  case
			if(root.right.data < data) {
				return LeftRotate(root);
			}
			//RL Case
			if(root.right.data > data) {
				root.right = RightRotate(root.right);
				return LeftRotate(root);
			}
		}
		
		return root;
	}
	private int min(Node root) {
		if(root.left!=null) {
			return min(root.left);
		}
		return root.data;
	}
	private int balance(Node root) {
		if(root == null) {
			return -1;
		}
		return getheight(root.left) - getheight(root.right);
	}
	public void LevelOrderDisplay(Node root) {
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node node = qu.poll();
			System.out.print(node.data+" ");
			if(node.left != null) {
				qu.add(node.left);
			}
			if(node.right != null) {
				qu.add(node.right);
			}
		}
	}
	public void LevelOrderHeight(Node root){
		Queue<Node> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node node = qu.poll();
			System.out.print(node.height+" ");
			if(node.left != null) {
				qu.add(node.left);
			}
			if(node.right !=null) {
				qu.add(node.right);
			}
				
		}
	}
	private Node RightRotate(Node root) {
		Node y = root.left;
		Node t = y.right;
		y.right = root;
		root.left = t;
		root.height = 1+Math.max(getheight(root.left), getheight(root.right));
		y.height = 1+Math.max(getheight(y.left), getheight(y.right));
		return y;
	}
	private Node LeftRotate(Node root) {
		Node y = root.right;
		Node t = y.left;
		y.left = root;
		root.right= t;
		root.height = 1+Math.max(getheight(root.left), getheight(root.right));
		y.height = 1+Math.max(getheight(y.left), getheight(y.right));
		return y;
	}
}
