package sa.edu.yuc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeIterator implements Iterator {
	BinarySearchTree b = new BinarySearchTreeImpl();
	public Iterator iter;
	public TreeIterator() {
		List list = new ArrayList<>();
		b.inOrder(list);
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
}