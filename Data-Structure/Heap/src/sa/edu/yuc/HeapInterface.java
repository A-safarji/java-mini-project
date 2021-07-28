package sa.edu.yuc;

public interface HeapInterface <E> {
	public boolean insert(E value);
	public E getParent(E value);
	public E getLeftChild(E value);
	public E getRightChild(E value);
	public void heapSort();
	public void print();
        public  E Findmax();
}
