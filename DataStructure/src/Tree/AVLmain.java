package Tree;

public class AVLmain {
	public static void main(String[] args) {
		AVLtree avl = new AVLtree(50);
		avl.insert( 20);
		avl.insert( 60);
		avl.insert( 10);
		avl.insert( 30);
		avl.insert( 40);
		System.out.println("Tree in level order ");
		avl.LevelOrderDisplay(avl.root);
		System.out.println();
		System.out.println("Height of the Tree in level order ");
		avl.LevelOrderHeight(avl.root);
		avl.insert(35);
		System.out.println();
		avl.LevelOrderDisplay(avl.root);
		avl.delete(10);
		System.out.println();
		avl.LevelOrderDisplay(avl.root);
		System.out.println();
		avl.LevelOrderHeight(avl.root);
	}
}
