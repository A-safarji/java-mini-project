package sa.edu.yuc;
import java.util.List;
public interface BinarySearchTree<T>  {
	public boolean isEmpty();
	public boolean insert(T item) throws DuplicateItemException;
	public T find(int id) throws TreeEmptyException;
	public void inOrder();
	public void preOrder();
	public void postOrder();
	public void inOrder(List list);
	public void preOrder(List list);
	public void postOrder(List list);
	public T maximum() throws TreeEmptyException;
	public T minimum() throws TreeEmptyException;
	
}
