package sa.edu.yuc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinarySearchTreeImpl<T> implements BinarySearchTree, Iterable{
	private Node<T> root;
       protected  int choice;
	
	@Override
	public boolean isEmpty() {
		return this.root == null;
	}
	@Override
	public boolean insert(int item) throws DuplicateItemException {
		Node newNode = new Node(item);
		if(isEmpty()){
			this.root = newNode;
			return true;
		}
		else{
				Node current = this.root;
				while(current != null){
					if(item < current.item){
						if(current.leftChild == null){
							current.leftChild = newNode;
							return true;
						}
						current = current.leftChild;
					}else if(item > current.item){
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
	public int find(int item) throws TreeEmptyException{
		if(isEmpty())
			throw new TreeEmptyException("Tree is Empty");
		Node current = this.root;
		int temp = -1;
		while (current != null && temp == -1) {
			if (current.item == item) {
				temp = current.item;
			} else if (item < current.item) {
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
	
	public String toString(){
		String temp = "";
		Iterator iter = iterator();
		while(iter.hasNext()){
			temp += iter.next() + "--->";
		}
		return temp;
	}
	
	@Override
	public int maximum() throws TreeEmptyException {
	   Node current = this.root;
		int temp;
		while(current.rightChild != null) {
			current = current.rightChild;
		}
		 temp = current.item;
		return temp;
		
	}
	@Override
	public int minimum() throws TreeEmptyException {
            Node current = this.root;
		
	int temp;
		while(current.leftChild != null) {
			current = current.leftChild;
		}
		 temp = current.item;
		return temp;
	
		
	}

    @Override
    public Iterator iterator() {
       return new TreeIterator (this);
    }
}