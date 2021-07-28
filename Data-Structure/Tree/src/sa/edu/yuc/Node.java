package sa.edu.yuc;

import java.util.List;

public class Node<T> {
	T item;
	Node<T> leftChild;
	Node<T> rightChild;
	public Node(T item){
		this.item = item;
	}

	public void preOrder(){
		// TODO Auto-generated method stub
		System.out.print(item + " --->");
		if(leftChild != null)
			this.leftChild.preOrder();
		if(rightChild != null)
			this.rightChild.preOrder();
	}
	public void postOrder() {
		// TODO Auto-generated method stub
		if(leftChild != null)
			this.leftChild.postOrder();
		if(rightChild != null)
			this.rightChild.postOrder();
		System.out.print(item + "--->");
	}
	public void inOrder(){
		if(leftChild != null)
			this.leftChild.inOrder();
		System.out.print(item + "--->");
		if(rightChild != null)
			this.rightChild.inOrder();
	}
	public void inOrder(List list) {
		if (leftChild != null) leftChild.inOrder(list);
		list.add(item);
		if (rightChild != null) rightChild.inOrder(list);
	}
	public void preOrder(List list) {
		// TODO Auto-generated method stub
		list.add(item);
		if(leftChild != null)
			this.leftChild.preOrder();
		if(rightChild != null)
			this.rightChild.preOrder();
	}
	public void postOrder(List list) {
		// TODO Auto-generated method stub
		if(leftChild != null)
			this.leftChild.preOrder();
		if(rightChild != null)
			this.rightChild.preOrder();
		list.add(item);
	
	}

	
	
}
