package Tree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		System.out.println("Binary Tree");
		BinaryTree tree = new BinaryTree(10);
		tree.insertleft(tree.root, 5);
		tree.insertright(tree.root, 15);
		tree.insertleft(tree.root.left, 3);
		tree.insertright(tree.root.left, 8);
		tree.insertleft(tree.root.right, 12);
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
		System.out.println("Here After Binary Search Tree :");
		BinarySearchTree bst = new BinarySearchTree(50);
		bst.Voidinsert(bst.root,20);
		bst.Voidinsert(bst.root,70);
		bst.Voidinsert(bst.root,10);
		bst.Voidinsert(bst.root,25);
		bst.Voidinsert(bst.root,60);
		bst.ReturnInsert(bst.root,90);
		bst.ReturnInsert(bst.root,55);
		bst.ReturnInsert(bst.root,80);
		bst.ReturnInsert(bst.root,75);
		bst.InOrder(bst.root);
		System.out.println();
		bst.Search(bst.root,10);
		bst.delete(70);
		bst.InOrder(bst.root);
		
	}
}
