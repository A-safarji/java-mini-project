package sa.edu.yuc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.omg.CORBA.Current;

public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T>, Iterable{
	private Node<T> root;
	
	/*public class Node{
		int item;
		Node leftChild;
		Node rightChild;
		public Node(int item){
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
	}*/
	@Override
	public boolean isEmpty() {
		return this.root == null;
	}
	@Override
	public boolean insert(T item) throws DuplicateItemException {
		Node<T> newNode = new Node<T>(item);
		
		if(isEmpty()){
			this.root = newNode;
			return true;
		}
		else{
				Node<T> current = this.root;
				while(current != null){
					if(item.compareTo(current.item) < 0){
						if(current.leftChild == null){
							current.leftChild = newNode;
							return true;
						}
						current = current.leftChild;
					}else if(item.compareTo(current.item) > 0){
						if(current.rightChild == null){
							current.rightChild = newNode;
							return true;
						}
						current = current.rightChild;
					}else{
						throw new DuplicateItemException("Item Already Exist");
					}
				}
			}
			return false;
		}
	@Override
	public T find(int id) throws TreeEmptyException{
		if(isEmpty())
			throw new TreeEmptyException("Tree is Empty");
		Node<Account> current = (Node<Account>) this.root;
		T temp = null;
		
		
		while (current != null && temp == null) {
			if (current.item.getId() ==id) {
				temp =  (T) current.item;
			} else if (id < current.item.getId())  {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}		
		return temp;
	}
	@Override
	public void inOrder(){
		root.inOrder();
	}
	@Override
	public void preOrder(){
		root.preOrder();
	}
	@Override
	public void postOrder(){
		root.postOrder();
	}
	public void inOrder(List list){
		root.inOrder(list);
	}
	public void preOrder(List list){
		root.preOrder(list);
	}
	public void postOrder(List list){
		root.postOrder(list);
	}
	@Override
	public Iterator iterator() {
		return new TreeIterator();
	}
	public String toString(){
		String temp = "";
		Iterator iter = iterator();
		while(iter.hasNext()){
			temp += iter.next() + "--->";
		}
		return temp;
	}
	/*public class TreeIterator implements Iterator {
		private Iterator iter;
		public TreeIterator() {
			List list = new ArrayList<>();
			inOrder(list);
			iter = list.iterator();
		}
		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}
		@Override
		public Object next() {
			return iter.next();
		}
	}*/
	@Override
	public T maximum() throws TreeEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new TreeEmptyException("Tree is empty!!");
		
		Node<T> current = root;
		Node<T> data = root;
		while(current.rightChild != null) {
			current = current.rightChild;
			if(current.rightChild == null) {
				 data.item = current.item;
			}
		}
		return  data.item;
	}
	@Override
	public T minimum() throws TreeEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new TreeEmptyException("Tree is empty!!");
		Node current = root;
		Node data = root;
		while(current.leftChild != null) {
			current = current.leftChild;
			if(current.leftChild == null) {
				data.item = current.item;
			}
		}
		return (T) data.item;	
	}
}