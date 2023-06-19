public class BST<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public BST() {
		this.root = null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void insert(T input) {		
		this.root = insertRecursive(input, this.root);
	}

	public Node<T> insertRecursive(T input, Node<T> someNode){
		Node<T> pointer = someNode;
		/*
		*/
		if( someNode == null ) {
			pointer = new Node<T>(input);	
		}
		else {
			/*
			*/
			T object1 = someNode.getData();
      T object2 = input;
			int evaluate = object1.compareTo(object2);
			//if (evaluate == 0) throw new ItemDuplicated("El dato " + input + " ya se encuentra.");
			if (evaluate == 0) {
				pointer.right = insertRecursive(input, someNode.getRight());				
			}
			if (evaluate < 0) {
				pointer.right = insertRecursive(input, someNode.getRight());				
			}
			else{
				pointer.left = insertRecursive(input, someNode.getLeft());				
			}
			/*
			*/
		}
		return pointer;
	}

	public String toString() {
		if (isEmpty())
			return "BT is empty.";
		String str = "";
		str += "In-Order: " + inOrder(this.root) + ".";
		str += "\n"+"Pre-Order: " + preOrder(this.root) + ".";
		str += "\n"+"Post-Order: " + postOrder(this.root) + ".";
		return str;
	}

	//Left-Root-Right
	public String inOrder(Node<T> node) {
		/*
		*/
		String str = "";
		if (node.getLeft() != null){
			str += inOrder(node.getLeft());	
		}
		str += node.getData().toString();
		if (node.getRight() != null){
			str += inOrder(node.getRight());
		}
		/*
		*/
		return str;
	}

	//Root-Left-Right
	public String preOrder(Node<T> node) {
		/*
		*/
		String str = "";
		str += node.getData().toString();
		if (node.getLeft() != null){
			str += preOrder(node.getLeft());
		}		
		if (node.getRight() != null){
			str += preOrder(node.getRight());
		}
		/*
		*/
		return str;
	}

	//Left-Right-Root
	public String postOrder(Node<T> node) {
		/*
		*/
		String str = "";
		if (node.getLeft() != null){
			str += postOrder(node.getLeft());
		}		
		if (node.getRight() != null){
			str += postOrder(node.getRight());
		}
		str += node.getData().toString();
		/*
		*/
		return str;
	}

}
