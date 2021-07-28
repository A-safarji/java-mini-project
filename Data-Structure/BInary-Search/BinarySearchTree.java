package sa.edu.yuc;
import java.util.List;
public interface BinarySearchTree<T> {
	public boolean isEmpty();
	public boolean insert(int item) throws DuplicateItemException;
	public int find(int item) throws TreeEmptyException;
	public void inOrder();
	public void preOrder();
	public void postOrder();
	public void inOrder(List list);
	public void preOrder(List list);
	public void postOrder(List list);
	public int maximum() throws TreeEmptyException;
	public int minimum() throws TreeEmptyException;

	
}
