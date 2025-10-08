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
		bst.ReturnInsert(bst.root,20);
		bst.Voidinsert(bst.root,30);
		bst.Voidinsert(bst.root,70);
		bst.Voidinsert(bst.root,80);
		bst.Voidinsert(bst.root,90);
		bst.Voidinsert(bst.root,10);
		bst.ReturnInsert(bst.root,25);
		bst.ReturnInsert(bst.root,210);
		bst.ReturnInsert(bst.root,120);
		bst.ReturnInsert(bst.root,2);
		bst.ReturnInsert(bst.root,0);
		bst.InOrder(bst.root);
		System.out.println();
		bst.Search(bst.root,10);
		bst.Search(bst.root,110);
		bst.Search(bst.root,120);
		bst.Search(bst.root,8);
	}
}
