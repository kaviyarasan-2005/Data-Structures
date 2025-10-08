package Tree;

public class BinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right=null;
		}
	}
	public BinarySearchTree(int data) {
		root = new Node(data);
	}
	public BinarySearchTree() {
		root = null;
	}
	
	public void Voidinsert(Node root,int data) {
		
		if(root.data >= data){
			if(root.left == null) {
				root.left = new Node(data);
				return;
			}
			Voidinsert(root.left,data);
		}
		else if(root.data<data) {
			if(root.right == null) {
				root.right = new Node(data);
				return;
			}
			Voidinsert(root.right,data);
		}
		return;
	}
	public Node ReturnInsert(Node r,int data) {
		if(r == null) {
			return new Node(data);
		}
		if(r.data > data) {
			r.left = ReturnInsert(r.left, data);
		}
		else{
			r.right = ReturnInsert(r.right, data);
		}
		return r;
	}
	public void InOrder(Node root) {
		if(root ==null) {
			return;
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public void Search(Node root,int data) {
		if(root == null) {
			System.out.println("Element not in tree");
			return;
		}
		else if(root.data == data) {
			System.out.println("Element Found");
			return;
		}
		else if(root.data > data) {
			Search(root.left, data);
		}
		else {
			Search(root.right, data);
		}
	}
}
