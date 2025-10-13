package Tree;

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
}
